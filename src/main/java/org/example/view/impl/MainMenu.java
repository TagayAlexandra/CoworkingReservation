package org.example.view.impl;

import org.example.view.ConsoleInputController;
import org.example.view.Menu;
import org.example.view.MessageConstant;

import static java.lang.Integer.MAX_VALUE;

public class MainMenu implements Menu {

    private final Menu adminMenu = new AdminMenu();

    private final Menu userMenu = new UserMenu();


    @Override
    public void view() {

        int VALUE_FOR_ADMIN = 1;
        int VALUE_FOR_USER = 2;
        int VALUE_FOR_EXIT = 0;

        int userConsoleInput = MAX_VALUE;

        while (userConsoleInput != VALUE_FOR_EXIT) {

            System.out.println(MessageConstant.HELLO_MESSAGE);
            System.out.println(MessageConstant.ROLE_OF_USER);
            System.out.println(MessageConstant.SELECTED_VALUE);
            userConsoleInput = ConsoleInputController.readInt();

            if (userConsoleInput == VALUE_FOR_ADMIN) {
                adminMenu.view();

            } else if (userConsoleInput == VALUE_FOR_USER) {
                userMenu.view();

            } else {
                System.out.println(MessageConstant.WRONG_INPUT);
            }
        }


    }
}
