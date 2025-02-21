package com.beyond.university.auth.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements UserDetails
{
    private int no;

    private String id;

    private String password;

    private String role;

    private String name;

    private String phone;

    private String email;

    private String address;

    private String hobby;

    private String status;

    private LocalDate enrollDate;

    private LocalDate modifyDate;

    // 사용자가 가지고 있는 권한의 목록을 반환한다.
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities()
    {
        List<GrantedAuthority> authorities = new ArrayList<>();

        authorities.add(new SimpleGrantedAuthority(this.role));

        return authorities;
    }

    // 사용자를 식별할 수 있는 사용자의 이름을 반환한다.
    @Override
    public String getUsername()
    {
        return this.id;
    }

    // 사용자의 비밀번호를 반환한다.
    @Override
    public String getPassword()
    {
        return this.password;
    }

    // 계정 만료 여부 (만료가 됐으면 true)
    @Override
    public boolean isAccountNonExpired()
    {
        return true;
    }

    // 계정 잠김 여부 (계정이 잠기지 않았으면 true)
    @Override
    public boolean isAccountNonLocked()
    {
        return true;
    }

    // 패스워드 만료 여부 (만료되지 않았으면 true)
    @Override
    public boolean isCredentialsNonExpired()
    {
        return true;
    }

    // 계정 활성화 여부 (계정이 활성화 됐으면 true)
    @Override
    public boolean isEnabled()
    {
        return this.status.equals("Y");
    }
}