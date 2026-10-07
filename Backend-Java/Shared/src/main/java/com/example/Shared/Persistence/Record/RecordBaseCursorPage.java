package com.example.Shared.Persistence.Record;

import java.util.List;
import java.util.UUID;

public record RecordBaseCursorPage<T>(List<T> items, UUID nextCursor, boolean hasMore) {
}
