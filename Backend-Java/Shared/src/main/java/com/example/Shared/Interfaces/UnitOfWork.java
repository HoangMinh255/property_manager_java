package com.example.Shared.Interfaces;

public interface UnitOfWork extends AutoCloseable {
    int saveChanges();

    @Override
    default void close() {
    }
}
