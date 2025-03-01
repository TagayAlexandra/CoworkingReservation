package org.example.repository;

public interface Repository <T> {

    void create(T t);
    T read(Long id);

    void  update(T t);

    void  delete(Long id);
}
