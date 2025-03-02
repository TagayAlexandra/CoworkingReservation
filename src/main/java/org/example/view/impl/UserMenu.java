package org.example.view.impl;

import org.example.view.Menu;
import org.example.view.MessageConstant;


public class UserMenu implements Menu {

    @Override
    public void view() {
        System.out.println(MessageConstant.USER_ACTION_PROMPT);
        System.out.println(MessageConstant.SELECTED_VALUE);


    }


}
