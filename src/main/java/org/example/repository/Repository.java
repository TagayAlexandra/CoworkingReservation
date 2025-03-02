package org.example.repository;

import java.util.List;

public interface Repository<T> {

    void create(T t);

    void update(T t);

    List<T> readAll();

    void delete(Long id);
}
