package com.company;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Menu {
    private Scanner input = new Scanner(System.in);

    //menu to prompt user for library options
    public void startMenu() {

        System.out.println("Welcome to the video game library!" +
                " What would you like to do? " +
                "\n 1. Add a game to the library  " +
                "\n 2. Remove a game from the library " +
                "\n 3. View what is currently in the library " +
                "\n 4. Check a game out " +
                "\n 5. Check a game in " +
                "\n 6. View checked games " +
                "\n 7. Exit the program ");
        try {

            switch (input.nextInt()) {
                case 1:
                    // add game
                    System.out.println("You have chosen to add a game \n " + "What is the title of this game?");
                    input.nextLine();
                    String title = input.nextLine();
                    Game game = new Game (title);
                    System.out.println("You have added " + game.getTitle() + " to your library. This game can now be checked out.");
                    break;
                case 2:
                    //remove game
                    System.out.println("You have chosen to remove a game from the library \n" + " Here is a list of games,"
                    + " type the number of the one you would like to remove.");
                    Library library = new Library (Game);
                    Library.removeGame(input.nextInt());


                    break;
                case 3:
                    // check out game
                    break;
                case 4:
                    //view library
                    break;
                case 5:
                    //check in game
                    break;
                case 6:
                    //view checked out games
                    break;
                case 7:
                    //exit
                    System.exit(0);
                    break;
                default:
                    //print to pick 1 through 7, loop back to menu
                    break;
                    //add limit for game library at 15 games
                    //print "your library is full at 15 games", return to menu

            }
        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("Select a number from 1 to 7.");
            startMenu();

        }
    }

}
