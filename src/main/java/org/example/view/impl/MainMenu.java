package org.example.view.impl;

import org.example.view.Menu;
import org.example.view.MessageConstant;

public class MainMenu implements Menu {

    @Override
    public void view() {
        System.out.println(MessageConstant.HELLO_MESSAGE);
        System.out.println(MessageConstant.ROLE_OF_USER);
        System.out.println(MessageConstant.SELECTED_VALUE);


    }
}
