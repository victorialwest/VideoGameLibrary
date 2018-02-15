package com.company;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.ArrayList;

public class Library {
    public final Menu menu;

    private List <Game> gameLibrary = new ArrayList<Game>();
    private List<Game> checkedOutGame = new ArrayList<Game>();
    private SimpleDateFormat dateFormat= new SimpleDateFormat("MM/dd/yy");


    public Library(Menu menu){
        this.menu = menu;
    }


    protected void addGame (Game game) {
        //code to add game to storage

        gameLibrary.add(game);
        menu.startMenu();
    }

    protected void removeGame(int gameIndex){
        gameIndex -= gameIndex;
        gameLibrary.remove(gameIndex);
        System.out.println("This game has been removed from your library");
        menu.startMenu();
    }

    protected void checkedOutGame(int gameIndex) {
        gameIndex -= gameIndex;
        Game game = gameLibrary.get(gameIndex);
        checkedOutGame.add(game);
        Calendar calendar = Calendar.getInstance();
        System.out.println("You have checked this game out on: " + dateFormat.format(calendar.getTime()));
        calendar.add(Calendar.DAY_OF_WEEK, 7);
        System.out.println("Your game is due back on: " + dateFormat.format(calendar.getTime()));
        game.setDueDate(dateFormat.format(calendar.getTime()));


            gameLibrary.remove(gameIndex);
            menu.startMenu();

    }


    public void listArrayItems(){
        int index = 1;

        for(String item : items);

        System.out.println(index ++  + " " );


    }
}
