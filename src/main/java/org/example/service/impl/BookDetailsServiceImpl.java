package org.example.service.impl;

import org.example.entity.BookingDetail;
import org.example.repository.Repository;
import org.example.service.BookDetailsService;

public class BookDetailsServiceImpl implements BookDetailsService {

    private final Repository<BookingDetail> repository;

    public BookDetailsServiceImpl(Repository<BookingDetail> repository) {
        this.repository = repository;
    }

    @Override
    public void create(BookingDetail bookingDetail) {
        repository.create(bookingDetail);

    }

    @Override
    public BookingDetail readById(Long id) {
        return repository.readAll().stream().filter(el -> el.getId().equals(id)).findFirst().orElseThrow();
    }

    @Override
    public void update(BookingDetail bookingDetail) {
        repository.update(bookingDetail);


    }

    @Override
    public void delete(Long id) {
        repository.delete(id);

    }
}
