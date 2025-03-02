package org.example.service.impl;

import org.example.entity.BookingDetail;
import org.example.exeption.DataNotFoundException;
import org.example.repository.Repository;
import org.example.service.BookDetailsService;
import org.example.view.MessageConstant;

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
    public BookingDetail readById(Long id) throws DataNotFoundException {
        return repository.readAll().stream()
                .filter(el -> el.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new DataNotFoundException(MessageConstant.DATA_NOT_FOUND));
    }

    @Override
    public void update(BookingDetail bookingDetail) throws DataNotFoundException {
        repository.update(bookingDetail);


    }

    @Override
    public void delete(Long id) throws DataNotFoundException {
        repository.delete(id);

    }
}
