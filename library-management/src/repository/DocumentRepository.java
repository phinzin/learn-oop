package repository;

import model.Document;

import java.io.IOException;

public interface DocumentRepository {
    public void add(Document document) throws IOException;

    public void update(Document document);

    public void delete(Document document);

    public Document get(Document document);
}
