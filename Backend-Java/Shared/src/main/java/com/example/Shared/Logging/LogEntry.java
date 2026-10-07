package com.example.Shared.Logging;

import java.time.OffsetDateTime;

public record LogEntry(
        OffsetDateTime timestamp,
        String module,
        String file,
        String layer,
        String member,
        String level,
        String message,
        String exception) {
}
