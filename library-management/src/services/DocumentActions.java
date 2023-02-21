package services;

import model.IDocument;

import java.io.IOException;

public interface DocumentActions {
    public void delete(Integer id);

    public void display();

    public IDocument search(Integer id);

    void add(IDocument document) throws IOException;

}
