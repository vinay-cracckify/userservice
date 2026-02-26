package com.cracckify.userservice.services;

import com.cracckify.userservice.models.Token;
import com.cracckify.userservice.models.User;

public interface UserService {
    public Token login(String email, String password);
    public User signUp(String name, String email, String password);
    public User validateToken(String token);
    public void logout(String token);
}
