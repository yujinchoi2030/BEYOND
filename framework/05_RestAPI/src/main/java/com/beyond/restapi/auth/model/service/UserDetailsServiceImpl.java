package com.beyond.restapi.auth.model.service;

import com.beyond.restapi.auth.model.mapper.AuthMapper;
import com.beyond.restapi.auth.model.vo.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Slf4j
@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService
{
    private final AuthMapper authMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
    {
        User user = authMapper.selectUserById(username);

        if(user == null)
        {
            throw new UsernameNotFoundException(username);
        }

        log.info("Username : {}", user.getId());

        return user;
    }
}