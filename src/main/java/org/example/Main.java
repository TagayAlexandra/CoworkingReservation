package org.example;


import org.example.view.Menu;
import org.example.view.impl.MainMenu;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Menu menu = new MainMenu();
        menu.view();


    }
}