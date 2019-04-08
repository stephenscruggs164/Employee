package com.company;

import java.util.Scanner;

public class Menu {
    // create method for user menu
    public  void showMenu(){

// declare and initialize local variables
        int userChoice;
        boolean quit = false;
        int amount = 0;
        Manager man = new Manager();
        Cashier cash = new Cashier();

// Output user menu
        do {
            System.out.println("Welcome, what type of employee are you?");
            System.out.println("1.Manager");
            System.out.println("2. Cashier");
           System.out.print("Your choice, 0 to quit: ");

// create a scanner object
            Scanner in = new Scanner(System.in);
            userChoice = in.nextInt();

// switch case statement to call methods
            switch (userChoice) {
                case 1:
                    man.manInput();
                    break;
                case 2:
                    cash.cashInput();
                    break;

                case 0:
                    quit = true;
                    break;
                default:
                    System.out.println("Wrong choice.");
                    break;

            }
            System.out.println();
        } while (!quit);
        System.out.println("Visit again!");
    }//end of ShowMenu()

}// end of class
