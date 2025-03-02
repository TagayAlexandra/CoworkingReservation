package org.example;

import org.example.command.CommandExecutorService;
import org.example.command.impl.AdminExecutorService;
import org.example.command.impl.UserExecutorService;
import org.example.view.ConsoleInputController;
import org.example.view.Menu;
import org.example.view.impl.AdminMenu;
import org.example.view.impl.MainMenu;
import org.example.view.impl.UserMenu;

import static java.lang.Integer.MAX_VALUE;

public class Application {

    private final Menu mainMenu = new MainMenu();
    private final Menu adminMenu = new AdminMenu();

    private final Menu userMenu = new UserMenu();

    private final CommandExecutorService adminExecutorService = new AdminExecutorService();
    private final CommandExecutorService userExecutorService = new UserExecutorService();

    public void start() {


        int VALUE_FOR_ADMIN = 1;
        int VALUE_FOR_USER = 2;
        int VALUE_FOR_EXIT = 0;

        int userConsoleInput = MAX_VALUE;

        while (userConsoleInput != VALUE_FOR_EXIT) {
            mainMenu.view();
            userConsoleInput = ConsoleInputController.readInt();

            if (userConsoleInput == VALUE_FOR_ADMIN) {
                adminMenu.view();
                userConsoleInput = ConsoleInputController.readInt();
                adminExecutorService.getCommand(userConsoleInput).execute();

            } else if (userConsoleInput == VALUE_FOR_USER) {
                userMenu.view();
                userConsoleInput = ConsoleInputController.readInt();
                userExecutorService.getCommand(userConsoleInput).execute();

            }
        }

    }
}
