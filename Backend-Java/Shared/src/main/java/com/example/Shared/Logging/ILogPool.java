package com.example.Shared.Logging;

import java.util.List;

public interface ILogPool {
    void add(String module, String layer, String file, String member,
            String level, String message, Throwable exception);

    List<LogEntry> fetch();
}
