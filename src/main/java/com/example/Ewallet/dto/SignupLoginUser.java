package com.example.Ewallet.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class SignupLoginUser {

    @NotNull
    @Email
    private String email;

    @NotNull
    @Size(min=8, max=15, message="Password must be between 8 and 15 characters")
    private String password;
}
