package com.progmatic.mvt;

import com.progmatic.mvt.model.Author;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    private Controller controller;

    private void mainMenu(Scanner sc) {
        String option = "xyz";
        do {
            switch (option) {
                case "1" -> {
                    System.out.println("Enter the name of the author: ");
                    String name = sc.nextLine();
                    System.out.println("Enter the date of birth of the author: ");
                    LocalDate dob = LocalDate.parse(sc.nextLine());
                    controller.addAuthor(name, dob);
                }
                case "2" -> {
                    deleteOrModifyAuthor();
                }
                case "3" -> {
                    System.out.println("Enter the title of the book: ");
                    String title = sc.nextLine();
                    System.out.println("Enter the author of the book: ");
                    String authorName = sc.nextLine();
                    Author author = controller.getAuthorByName(authorName);
                    controller.addBook(title, author);
                }
                case "4" -> {
                    System.out.println("Enter the book's title: ");
                    String title = sc.nextLine();
                    controller.modifyBook(title);
                }
                case "5" -> controller.addStore();
                default -> {
                    if (!option.equalsIgnoreCase("xyz")) {
                        System.out.println("Unknown option.");
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
        System.out.println("2 - Delete/modify an author");
        System.out.println("3 - Add a new book to the database");
        System.out.println("4 - Modify a book");
        System.out.println("5 - Add a new store to the database");
        System.out.println("6 - Delete a store from the database");
        System.out.println("Q - Quit");
        System.out.println("*".repeat(20));
    }

    private void deleteOrModifyAuthor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Press "D" if you want to delete an author
                Press "M" if you want to modify the settings of an author
                Press "B" if you'd like to go back to the menu""");
        String option = "xyz";
        do {
            switch (option) {
                case "D" -> {
                    System.out.println("Enter the name of the author: ");
                    String name = sc.nextLine();
                    controller.deleteAuthor(name);
                }
                case "M" -> {
                    System.out.println("Enter the name of the author: ");
                    String name = sc.nextLine();
                    System.out.println("Okay, what would you like to be the new name of the author?: ");
                    String newName = sc.nextLine();
                    controller.modifyAuthorName(name, newName);
                    System.out.println("Changed the name of the author from " + name + " to " + newName);
                    System.out.println("Would you like to change the date of birth as well?");
                    System.out.println("""
                            Press "Y" if you would like to change it, "N" if not""");
                    if (sc.nextLine().equals("Y")){
                        System.out.println("Okay then, please enter the new date of birth in YYYY-MM-DD format: ");
                        LocalDate newDob = LocalDate.parse(sc.nextLine());
                        controller.modifyAuthorDob(name, newDob);
                    } else if (sc.nextLine().equals("N")){
                        printMenu();
                    } else {
                        System.out.println("Unknown option. Taking you back to author deletion or modification menu.");
                        deleteOrModifyAuthor();
                    }
                }
                default -> {
                    if (!option.equalsIgnoreCase("xyz")) {
                        System.out.println("That is not an option!");
                    }
                }
            }
        } while (!"B".equalsIgnoreCase(option = sc.nextLine()));
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
