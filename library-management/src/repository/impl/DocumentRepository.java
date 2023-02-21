package repository.impl;

import model.Document;
import repository.IDocumentRepository;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class DocumentRepository implements IDocumentRepository {
    public static DocumentRepository documentRepository = null;
    public static DocumentRepository getInstance(){
        if(documentRepository == null){
            return new DocumentRepository();
        }
        return documentRepository;
    }
    List<Document> docs;
    DocumentRepository(){
        docs = new ArrayList<>();

    }
    @Override
    public void add(Document document){
        docs.add(document);
    }

    @Override
    public void update(Document document) {
        docs = docs.stream().map(o -> o.getId() == document.getId() ? document : o)
                                     .collect(toList());
    }

    @Override
    public void delete(Integer id) {
        docs.removeIf(document -> document.getId().equals(id));
    }

    @Override
    public Document get(Integer id) {
        for (Document doc:docs){
            if(doc.getId().equals(id)){
                return doc;
            }
        }
        return null;
    }

    @Override
    public List<Document> getAll() {
        return docs;
    }
}
