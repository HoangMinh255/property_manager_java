package com.example.Shared.Interfaces;

import java.util.List;

public interface BasePostRepository<T> {
    T add(T entity);
    List<T> addAll(Iterable<T> entities);
    T update(T entity);
    List<T> updateAll(Iterable<T> entities);
}
