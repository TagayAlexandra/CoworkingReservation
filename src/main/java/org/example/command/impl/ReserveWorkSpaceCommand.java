package org.example.command.impl;

import org.example.command.Command;
import org.example.entity.BookingDetail;
import org.example.repository.impl.CollectionBookingDetailsRepository;
import org.example.service.BookDetailsService;
import org.example.service.impl.BookDetailsServiceImpl;

public class ReserveWorkSpaceCommand implements Command {

    BookDetailsService bookDetailsService = new BookDetailsServiceImpl(new CollectionBookingDetailsRepository());
    @Override
    public void execute() {
       // BookingDetail bookingDetail = new BookingDetail();
        //bookDetailsService.create();

    }
}
