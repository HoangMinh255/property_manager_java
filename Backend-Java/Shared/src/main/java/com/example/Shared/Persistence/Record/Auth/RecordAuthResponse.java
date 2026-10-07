package com.example.Shared.Persistence.Record.Auth;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record RecordAuthResponse(
        UUID accountId,
        String email,
        boolean isActive,
        List<String> roleCodes,
        List<String> permissionCodes,
        LocalDateTime accountCreatedAt,
        LocalDateTime accountUpdatedAt) {
}
