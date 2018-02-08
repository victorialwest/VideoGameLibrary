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
                "\n3. View what is currently in the library " +
                "\n 4. Check a game out " +
                "\n 5. Check a game in " +
                "\n 6.View checked games " +
                "\n Exit the program ");
        try {

            switch (input.nextInt()) {
                case 1:
                    // add game
                    System.out.println("");

                    break;
                case 2:
                    //remove game
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
                    break;
                default:
                    //print to pick 1 through 7, loop back to menu
                    break;

            }
        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("Select a number from 1 to 7.");
            startMenu();

        }
    }

}
