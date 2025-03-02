package org.example.repository;

import org.example.exeption.DataNotFoundException;

import java.util.List;

public interface Repository<T> {

    void create(T t);

    void update(T t) throws DataNotFoundException;

    List<T> readAll();

    void delete(Long id) throws DataNotFoundException;
}
