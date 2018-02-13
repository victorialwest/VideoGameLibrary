package com.company;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.ArrayList;

public class Library {

    protected void addGame (Game game) {
        //code to add game to storage

        gameLibrary.add(game);
        menu.startMenu();
    }
}
