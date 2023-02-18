package controller;

import model.Book;
import model.Constants;
import services.impl.BookManagement;

import java.io.IOException;
import java.util.Scanner;

public class BookController {
    BookManagement bookManagement;

    public BookController() {
        bookManagement = new BookManagement();
    }

    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nBook id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Book publisher: ");
        String publisher = scanner.nextLine();
        System.out.print("Book version: ");
        String version = scanner.nextLine();
        System.out.print("Book author: ");
        String author = scanner.nextLine();
        System.out.print("Book noOfPages: ");
        int noOfPages = Integer.parseInt(scanner.nextLine());
        Book book = new Book.Builder(id, publisher, version).withAuthor(author)
                                                            .withNoOfPages(noOfPages)
                                                            .build();

        try {
            bookManagement.add(book);
            System.out.println(String.format(Constants.ADD_SUCCESS, "Book"));
        } catch (IOException e) {
            System.out.println("can't add due to: " + e.getMessage());
        }
    }
}
