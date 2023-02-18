package services;

import model.Document;

import java.io.IOException;

public interface DocumentActions {
    public void delete(String id);

    public void display();

    public void search();

    void add(Document document) throws IOException;
}
