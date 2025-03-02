package org.example.repository.impl;

import org.example.entity.BookingDetail;
import org.example.exeption.DataNotFoundException;
import org.example.repository.BookingDetailsRepository;
import org.example.view.MessageConstant;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CollectionBookingDetailsRepository implements BookingDetailsRepository {

    private final List<BookingDetail> bookingDetailList = new ArrayList<>();

    @Override
    public void create(BookingDetail bookingDetail) {
        bookingDetailList.add(bookingDetail);

    }

    @Override
    public void update(BookingDetail bookingDetail) throws DataNotFoundException {
        int index = getIndexById(bookingDetail.getId())
                .orElseThrow(() -> new DataNotFoundException(MessageConstant.DATA_NOT_FOUND));
        bookingDetailList.set(index, bookingDetail);


    }

    @Override
    public List<BookingDetail> readAll() {
        return bookingDetailList;
    }

    @Override
    public void delete(Long id) throws DataNotFoundException {
        int index = getIndexById(id)
                .orElseThrow(() -> new DataNotFoundException(MessageConstant.DATA_NOT_FOUND));
        bookingDetailList.remove(index);
    }


    private Optional<Integer> getIndexById(Long id) {
        for (int i = 0; i < bookingDetailList.size(); i++) {
            if (bookingDetailList.get(i).getId().equals(id)) {
                return Optional.of(i);
            }
        }
        return Optional.empty();
    }


}

