package repository;

import model.IDocument;

import java.io.IOException;
import java.util.List;

public interface IDocumentRepository {
    public void add(IDocument document) throws IOException;

    public void update(IDocument document);

    public void delete(Integer id);

    public IDocument get(Integer id);

    public List<IDocument> getAll();
}
