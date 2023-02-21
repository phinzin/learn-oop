package services;

import model.Document;

import java.io.IOException;

public interface DocumentActions {
    public void delete(Integer id);

    public void display();

    public Document search(Integer id);

    void add(Document document) throws IOException;
}
