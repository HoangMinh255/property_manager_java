package com.example.Identity.Presentation.Record;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record AuthRequest(@Email @NotBlank String email, @NotBlank String password) {
}
