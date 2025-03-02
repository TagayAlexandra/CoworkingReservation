package org.example.service;


public interface Service<T> {
    void create(T t);

    T readById(Long id);

    void update(T t);

    void delete(Long id);
}
