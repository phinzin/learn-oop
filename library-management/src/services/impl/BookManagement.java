package services.impl;

import model.Document;
import repository.DocumentRepository;
import repository.impl.BookRepository;
import services.DocumentActions;
import services.Exitable;

import java.io.IOException;

public class BookManagement extends Exitable implements DocumentActions {

    DocumentRepository bookRepository;

    public BookManagement() {
        bookRepository = new BookRepository();
    }

    @Override
    public void delete(String id) {
        System.out.println("deleting book with id");
    }

    @Override
    public void display() {
        System.out.println("book info");
    }

    @Override
    public void search() {
        System.out.println("searching book with info");
    }

    @Override
    public void add(Document document) throws IOException {
        bookRepository.add(document);
    }
}
