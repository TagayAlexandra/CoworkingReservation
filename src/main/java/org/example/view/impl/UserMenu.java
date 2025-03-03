package org.example.view.impl;

import org.example.entity.BookingDetail;
import org.example.repository.BookingDetailsRepository;
import org.example.repository.WorkSpaceRepository;
import org.example.repository.impl.CollectionBookingDetailsRepository;
import org.example.repository.impl.CollectionWorkSpaceRepository;
import org.example.service.BookDetailsService;
import org.example.service.WorkSpaceService;
import org.example.service.impl.BookDetailsServiceImpl;
import org.example.service.impl.WorkSpaceServiceImpl;
import org.example.view.ConsoleInputController;
import org.example.view.Menu;
import org.example.view.MessageConstant;
import org.example.view.StringToTypeConverter;


public class UserMenu implements Menu {
    private final WorkSpaceRepository workSpaceRepository = CollectionWorkSpaceRepository.getInstance();
    private final WorkSpaceService workSpaceService = new WorkSpaceServiceImpl(workSpaceRepository);

    private final BookingDetailsRepository bookingDetailsRepository = CollectionBookingDetailsRepository.getInstance();
    private final BookDetailsService bookDetailsService = new BookDetailsServiceImpl(bookingDetailsRepository);

    private final StringToTypeConverter stringToTypeConverter = new StringToTypeConverter();


    @Override
    public void view() {

        int VALUE_WORK_SPACE_IS_AVAILABLE = 1;
        int VALUE_BOOK_WORK_SPACE = 2;
        int VALUE_VIEW_BOOKING_WORK_SPACE = 3;
        int VALUE_CANCEL_BOOKING = 4;
        int VALUE_FOR_MAIN_MENU = 0;
        int userInput = Integer.MAX_VALUE;

        while (userInput != VALUE_FOR_MAIN_MENU) {
            System.out.println(MessageConstant.USER_ACTION_PROMPT);
            System.out.println(MessageConstant.SELECTED_VALUE);
            userInput = ConsoleInputController.readInt();

            if (userInput == VALUE_WORK_SPACE_IS_AVAILABLE) {
                workSpaceService.readAllAvailableWorkSpaces().forEach(System.out::println);

            } else if (userInput == VALUE_BOOK_WORK_SPACE) {
                System.out.println(MessageConstant.WORKSPACE_ID);
                String userInputWorkSpaceId = ConsoleInputController.readString();
                System.out.println(MessageConstant.ENTER_BOOKING_DETAIL);
                String userInputBookingDetails = ConsoleInputController.readString();
                BookingDetail bookingDetail = stringToTypeConverter.parsingStringToBookingDetail(userInputBookingDetails, userInputWorkSpaceId);
                bookDetailsService.create(bookingDetail);

            } else if (userInput == VALUE_VIEW_BOOKING_WORK_SPACE) {
                workSpaceService.readAllBookingWorkSpaces().forEach(System.out::println);

            } else if (userInput == VALUE_CANCEL_BOOKING) {
                System.out.println(MessageConstant.WORKSPACE_ID);
                String userInputBookingId = ConsoleInputController.readString();
                Long bookingId = stringToTypeConverter.convertStringToLong(userInputBookingId);
                bookDetailsService.delete(bookingId);
            } else {
                System.out.println(MessageConstant.WRONG_INPUT);
            }

        }


    }


}
