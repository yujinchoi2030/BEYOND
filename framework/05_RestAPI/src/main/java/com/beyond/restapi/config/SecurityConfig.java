package com.beyond.restapi.config;

import com.beyond.restapi.auth.jwt.JwtAuthenticationFilter;
import com.beyond.restapi.auth.jwt.JwtTokenProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig
{
    private final JwtTokenProvider jwtTokenProvider;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception
    {
        http
                .csrf(AbstractHttpConfigurer::disable)
                .cors(Customizer.withDefaults())
                .httpBasic(AbstractHttpConfigurer::disable)
                .formLogin(AbstractHttpConfigurer::disable)
                // JWT 토큰으로 인증을 처리하기 때문에 세션을 사용하지 않는다.
                .sessionManagement(session ->
                        session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                )
                // JwtAuthenticationFilter 를 UsernamePasswordAuthenticationFilter 앞에 추가하는 설정
                // JwtAuthenticationFilter 에서 인증 정상처리 되면, UsernamePasswordAuthenticationFilter 는 자동으로 통과한다.
                .addFilterBefore(new JwtAuthenticationFilter(jwtTokenProvider), UsernamePasswordAuthenticationFilter.class)
                .authorizeHttpRequests(requests -> {
                    // Swagger
                    requests.requestMatchers("/v3/api-docs/**", "/swagger-ui/**", "/actuator/health").permitAll();
                    // 모든 GET 요청의 경우 허용
                    requests.requestMatchers(HttpMethod.GET, "/api/v1/**").permitAll();
                    // 이 외의 모든 요청은 인증이 필요
                    requests.anyRequest().authenticated();
                });

        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder()
    {
        return new BCryptPasswordEncoder();
    }
}
