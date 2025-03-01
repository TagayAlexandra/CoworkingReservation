package org.example.service.impl;

import org.example.entity.BookingDetail;
import org.example.repository.Repository;
import org.example.service.Service;

public class BookDetailsService implements Service<BookingDetail> {

    private final Repository<BookingDetail> repository;

    public BookDetailsService(Repository<BookingDetail> repository) {
        this.repository = repository;
    }

    @Override
    public void create(BookingDetail bookingDetail) {
        repository.create(bookingDetail);

    }

    @Override
    public BookingDetail read(Long id) {
        return repository.read(id);
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
