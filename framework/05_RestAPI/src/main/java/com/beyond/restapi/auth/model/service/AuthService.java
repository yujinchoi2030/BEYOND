package com.beyond.restapi.auth.model.service;

import com.beyond.restapi.auth.model.dto.TokenResponseDto;

public interface AuthService
{
    TokenResponseDto login(String username, String password);

    void logout(String bearerToken);
}
