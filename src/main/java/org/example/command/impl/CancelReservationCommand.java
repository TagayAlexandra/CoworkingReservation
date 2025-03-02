package org.example.command.impl;

import org.example.command.Command;
import org.example.repository.impl.CollectionBookingDetailsRepository;
import org.example.service.BookDetailsService;
import org.example.service.impl.BookDetailsServiceImpl;

public class CancelReservationCommand implements Command {

   private final BookDetailsService bookDetailsService = new BookDetailsServiceImpl(new CollectionBookingDetailsRepository());
    @Override
    public void execute() {
        Long id = 1L;
        bookDetailsService.delete(id);

    }
}
