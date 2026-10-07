package com.example.Shared.Persistence.Record.Auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record RecordAuthRequest(@Email @NotBlank String email, @NotBlank String password) {
}
