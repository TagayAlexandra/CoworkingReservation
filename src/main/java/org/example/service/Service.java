package org.example.service;

public interface Service <T>{
    void create(T t);
    T read(Long id);

    void  update(T t);

    void  delete(Long id);
}
