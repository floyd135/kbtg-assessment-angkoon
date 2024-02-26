package com.example.java_final_assessment.Users;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public class UserRequestDto {

    @NotNull
    @Email
    private String email;

    @NotNull
    private String password;

    @NotNull
    private String name;

    @NotNull
    private boolean role;

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public boolean getRole() {
        return role;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(boolean role) {
        this.role = role;
    }
}

