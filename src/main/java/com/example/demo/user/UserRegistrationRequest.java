package com.example.demo.user;

import jakarta.validation.constraints.NotBlank;

public class UserRegistrationRequest {
    @NotBlank
    private String username;

    @NotBlank
    private String password;

    // Геттеры и сеттеры
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
