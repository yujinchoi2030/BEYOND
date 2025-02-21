package com.beyond.university.config;

import com.beyond.university.auth.handler.LoginFailureHandler;
import com.beyond.university.auth.handler.LoginSuccessHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

@Configuration
@EnableWebSecurity
public class SecurityConfig
{
    @Bean
    // HttpSecurity 타입의 객체로 스프링 시큐리티의 대부분의 설정을 할 수 있다.
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception
    {
        /*
            CSRF (Cross-Site Request Forgery) 란?
            공격자가 사용자의 인증 정보(세션 쿠키 등)를 이용해 사용자의 권한으로 악성 요청을 보내는 공격 방식
            Spring Security 는 기본적으로 CSRF 보호를 활성화하여 GET 요청 외에
            POST, PUT,DELETE 등의 요청에서 CSRF 토큰을 검증한다.
        */
        // CSRF 설정을 비활성화
        // http.csrf(AbstractHttpConfigurer::disable);
        http.csrf(Customizer.withDefaults()) // CSRF 기본 설정 사용,
                .httpBasic(Customizer.withDefaults()) // HTTP Basic 인증 활성화
                //.formLogin(Customizer.withDefaults()) // login 폼을 통해 인증할수 있도록 인증 활성화
                // 접근 제어 설정 (인증 및 권한 부여 규칙을 설정) (모든 인증을 통한 사용자만 접근 가능)
                //.authorizeHttpRequests(authorizeRequests -> {
                //    authorizeRequests.anyRequest().authenticated();
                //});
                // 스프링에서 지원해주는 login 페이지가 아니라 다른 디자인을 사용하고 싶으면 사용
                .formLogin(form ->
                        form
                                .loginPage("/login")
                                .usernameParameter("userId")
                                .passwordParameter("userPwd")
                                .successHandler(loginSuccessHandler())
                                .failureHandler(loginFailureHandler())
                )
                // 로그아웃 설정
                .logout(logout ->
                        logout
                                .logoutUrl("/logout")
                                .logoutSuccessUrl("/login?logout=true")
                                .invalidateHttpSession(true)
                                .deleteCookies("JSESSIONID")
                )
                // 에러 핸들러 설정 - 권한이 없는 계정에서 잘못된 접근 시 이동할 URL을 지정한다.
                .exceptionHandling(exception ->
                        exception
                            .accessDeniedPage("/accessDenied")
                )
                // 기억하기 기능 설정 - 한번 로그인한 사용자가 재방문했을시 브라우저가 사용자를 기억 (브라우저를 껐다켜도 가능)
                .rememberMe(rememberMe ->
                        rememberMe
                                .key("beyond") // 쿠키의 값을 암호화할 키 값
                                .tokenValiditySeconds(1209600)) // 쿠키의 유효시간을 지정 (2주)
                // 세션 관리 설정 - 로그인 세션 1개만 유지
                .sessionManagement(session ->
                                session
                                        .invalidSessionUrl("/login") // 세션이 만료되었을 때 이동할 URL
                                        .maximumSessions(1) // 최대 세션의 수
                                        .expiredUrl("/login?expired=true") // 마지막 연결된 세션이 끊겼을 때 이동할 URL
                        )
                // 접근 제거 설정 - /login URL 및 정적 리소스 파일은 인증 없이 접근할 수 있고, /login이 아니면 인증이 필요하다고 설정
                .authorizeHttpRequests(authorizeRequests -> {
                    authorizeRequests
                            // 정적 리소스 허용
                            .requestMatchers("/js/**", "/css/**", "/images/**").permitAll()
                            .requestMatchers("/login").permitAll()
                            .requestMatchers("/admin/**").hasRole("ADMIN")
                            .requestMatchers("/user/**").hasAnyRole("ADMIN", "USER")
                            .anyRequest().authenticated();
                });

        return http.build();
    }

//    // UserDetailsService -전달받은 정보를 통해 사용자를 찾아 UserDetails 객체를 생성한다.
//    @Bean
//    public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder)
//    {
//        // 인 메모리 방식 설정 (테스트 용도로 사용)
//        UserDetails user = User.builder()
//                .username("user")
//                .password(passwordEncoder.encode("1234"))
//                .roles("USER")
//                .build();
//
//        UserDetails admin = User.builder()
//                .username("admin")
//                .password(passwordEncoder.encode("5678"))
//                .roles("ADMIN")
//                .build();
//
//        return new InMemoryUserDetailsManager(user, admin);
//    }

    // AuthenticationManager
    // - 유저들에 대한 인증과 관련된 설정을 하는 객체이다.
    @Bean
    public AuthenticationManager authenticationManager(UserDetailsService userDetailsService, PasswordEncoder passwordEncoder)
    {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();

        provider.setUserDetailsService(userDetailsService);
        provider.setPasswordEncoder(passwordEncoder);

        return new ProviderManager(provider);
    }

    @Bean
    // PasswordEncoder 설정 (BCrypt 설정)
    public BCryptPasswordEncoder bCryptPasswordEncoder()
    {
        return new BCryptPasswordEncoder();
    }

    // AuthenticationSuccessHandler, AuthenticationFailureHandler 설정
    @Bean
    public AuthenticationSuccessHandler loginSuccessHandler()
    {
        return new LoginSuccessHandler();
    }

    @Bean
    public AuthenticationFailureHandler loginFailureHandler()
    {
        return new LoginFailureHandler();
    }
}
