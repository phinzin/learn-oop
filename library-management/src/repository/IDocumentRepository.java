package repository;

import model.Document;

import java.io.IOException;
import java.util.List;

public interface IDocumentRepository {
    public void add(Document document) throws IOException;

    public void update(Document document);

    public void delete(Integer id);

    public Document get(Integer id);

    public List<Document> getAll();
}
