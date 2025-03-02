package org.example.service;


import org.example.exeption.DataNotFoundException;

public interface Service<T> {
    void create(T t);

    T readById(Long id) throws DataNotFoundException;

    void update(T t) throws DataNotFoundException;

    void delete(Long id) throws DataNotFoundException;
}
