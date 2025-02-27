package com.beyond.restapi.auth.controller;

import com.beyond.restapi.auth.model.dto.LoginRequestDto;
import com.beyond.restapi.auth.model.dto.TokenResponseDto;
import com.beyond.restapi.auth.model.service.AuthService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
@Tag(name = "Auth APIs", description = "인증 관련 API 목록")
public class AuthController
{
    private final AuthService authService;

    @PostMapping("login")
    @Operation(summary = "로그인", description = "아이디와 패스워드를 JSON으로 받아서 로그인한다.")
    @ApiResponses({
            @ApiResponse(
                    responseCode = "200",
                    description = "OK",
                    content = @Content(mediaType = "application/json")
            ),
            @ApiResponse(
                    responseCode = "401",
                    description = "UNAUTHORIZED",
                    content = @Content(mediaType = "application/json")
            ),
            @ApiResponse(
                    responseCode = "500",
                    description = "INTERNAL SERVER ERROR",
                    content = @Content(mediaType = "application/json")
            )
    })
    public ResponseEntity<TokenResponseDto> login(@Valid @RequestBody LoginRequestDto loginRequestDto)
    {
        TokenResponseDto tokenResponseDto = authService.login(loginRequestDto.getUsername(), loginRequestDto.getPassword());

        return ResponseEntity.ok(tokenResponseDto);
    }

    @PostMapping("/logout")
    @Operation(summary = "로그아웃", description = "액세스 토큰을 전달해 로그아웃한다.")
    @ApiResponses({
            @ApiResponse(
                    responseCode = "204",
                    description = "NO CONTENT",
                    content = @Content(mediaType = "application/json")
            ),
            @ApiResponse(
                    responseCode = "500",
                    description = "INTERNAL SERVER ERROR",
                    content = @Content(mediaType = "application/json")
            )
    })
    public ResponseEntity<Void> logout(@RequestHeader("Authorization") String bearerToken)
    {
        authService.logout(bearerToken);

        return ResponseEntity.noContent().build();
    }
}
