package org.example.repository.impl;

import org.example.entity.BookingDetail;
import org.example.repository.BookingDetailsRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CollectionBookingDetailsRepository implements BookingDetailsRepository {

    private static CollectionBookingDetailsRepository collectionBookingDetailsRepository;
    private final List<BookingDetail> bookingDetailList = new ArrayList<>();


    private CollectionBookingDetailsRepository() {
    }

    public static CollectionBookingDetailsRepository getInstance() {
        if (collectionBookingDetailsRepository == null) {
            collectionBookingDetailsRepository = new CollectionBookingDetailsRepository();
        }
        return collectionBookingDetailsRepository;
    }

    @Override
    public void create(BookingDetail bookingDetail) {
        bookingDetailList.add(bookingDetail);

    }

    @Override
    public void update(BookingDetail bookingDetail) {
        int index = getIndexById(bookingDetail.getId()).orElseThrow();
        bookingDetailList.set(index, bookingDetail);


    }

    @Override
    public List<BookingDetail> readAll() {
        return bookingDetailList;
    }

    @Override
    public void delete(Long id) {
        int index = getIndexById(id).orElseThrow();
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

