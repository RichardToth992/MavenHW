package com.progmatic.mvt;

import com.progmatic.mvt.model.Author;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    private Controller controller;

    private void mainMenu(Scanner sc) {
        String option = "0";
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
                    System.out.println("Enter the author's name: ");
                    long id = sc.nextLong();
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
                    controller.deleteBook(title);
                }
                case "5" -> controller.addStore();
                default -> {
                    if (!option.equalsIgnoreCase("0")) {
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
        System.out.println("2 - Delete an author from the database");
        System.out.println("3 - Add a new book to the database");
        System.out.println("4 - Delete a book from the database");
        System.out.println("5 - Add a new store to the database");
        System.out.println("6 - Delete a store from the database");
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
