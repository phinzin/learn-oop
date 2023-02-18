package services.impl;

import model.Document;
import repository.DocumentRepository;
import repository.impl.NewspaperRepository;
import services.DocumentActions;
import services.Exitable;

import java.io.IOException;

public class NewspaperManagement extends Exitable implements DocumentActions {
    DocumentRepository documentRepository;

    public NewspaperManagement() {
        documentRepository = new NewspaperRepository();
    }

    @Override
    public void delete(String id) {
        System.out.println("deleting newspaper with id");
    }

    @Override
    public void display() {
        System.out.println("newspaper info");
    }

    @Override
    public void search() {
        System.out.println("searching newspaper with info");
    }

    @Override
    public void add(Document document) throws IOException {
        documentRepository.add(document);
    }

}
