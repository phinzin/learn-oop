package repository.impl;

import model.Document;
import repository.DocumentRepository;

import java.io.FileOutputStream;
import java.io.IOException;

public class NewspaperRepository implements DocumentRepository {

    @Override
    public void add(Document document) throws IOException {
        FileOutputStream outputStream = new FileOutputStream("newspaper.txt", true);
        byte[] strToBytes = document.toString().getBytes();
        outputStream.write(strToBytes);
        outputStream.close();
    }

    @Override
    public void update(Document document) {

    }

    @Override
    public void delete(Document document) {

    }

    @Override
    public Document get(Document document) {
        return null;
    }
}
