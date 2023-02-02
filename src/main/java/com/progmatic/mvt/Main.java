package com.progmatic.mvt;

import java.util.*;

public class Main {

    private Controller controller;

    private void mainMenu(Scanner sc){
        String option = "0";
        do {
            switch (option){
                case "1" -> controller.addBook();
                case "2" -> controller.addAuthor();
                case "3" -> controller.addStore();
                default -> {
                    if (!option.equalsIgnoreCase("0")){
                        System.out.println("That is not an option!");
                    }
                }
            }
            printMenu();
            System.out.println("Which one you'd like to choose? ");
        } while (!"Q".equalsIgnoreCase(option = sc.nextLine()));

    }

    private void printMenu() {
        System.out.println("*".repeat(20));
        System.out.println("Welcome! Please choose from the following options: ");
        System.out.println("1 - Add a new author to the database");
        System.out.println("2 - Add a new book to the database");
        System.out.println("3 - Add a new store to the database");
        System.out.println("Q - Quit");
        System.out.println("*".repeat(20));
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        try (
                Scanner sc = new Scanner(System.in);
                Controller c = new Controller()
                ) {
            m.controller = c;
            m.mainMenu(sc);
        }
    }
}
