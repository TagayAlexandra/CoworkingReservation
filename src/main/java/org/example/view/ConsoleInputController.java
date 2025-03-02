package org.example.view;

import java.util.Scanner;

public class ConsoleInputController {
    private static final Scanner scanner = new Scanner(System.in);

    public static String readString() {
        return scanner.nextLine();

    }

    public static int readInt() {
        String intInput = scanner.nextLine().trim();
        return Integer.parseInt(intInput);
    }

}
