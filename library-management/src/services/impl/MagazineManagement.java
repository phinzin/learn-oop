package services.impl;

import model.Document;
import repository.DocumentRepository;
import repository.impl.MagazineRepository;
import services.DocumentActions;
import services.Exitable;

import java.io.IOException;

public class MagazineManagement extends Exitable implements DocumentActions {
    DocumentRepository documentRepository;

    public MagazineManagement(){
        documentRepository = new MagazineRepository();
    }

    @Override
    public void delete(String id) {
        System.out.println("deleting magazine with id");
    }

    @Override
    public void display() {
        System.out.println("book magazine");
    }

    @Override
    public void search() {
        System.out.println("searching magazine with info");
    }

    @Override
    public void add(Document document) throws IOException {
        documentRepository.add(document);
    }
}
