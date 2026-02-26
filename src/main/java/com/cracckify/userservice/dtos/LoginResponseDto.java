package com.cracckify.userservice.dtos;

import com.cracckify.userservice.models.Token;

public class LoginResponseDto {
    private Token token;

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }
}
