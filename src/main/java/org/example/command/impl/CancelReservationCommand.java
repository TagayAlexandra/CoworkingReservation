package org.example.command.impl;

import org.example.command.Command;
import org.example.repository.impl.CollectionBookingDetailsRepository;
import org.example.service.BookDetailsService;
import org.example.service.impl.BookDetailsServiceImpl;
import org.example.view.ConsoleInputController;
import org.example.view.MessageConstant;

public class CancelReservationCommand implements Command {

   private final BookDetailsService bookDetailsService = new BookDetailsServiceImpl(new CollectionBookingDetailsRepository());
    @Override
    public void execute() {
        System.out.println(MessageConstant.BOOK_DETAIL_ID);
        String userInputId = ConsoleInputController.readString();
        Long id = Long.parseLong(userInputId);
        bookDetailsService.delete(id);

    }
}
