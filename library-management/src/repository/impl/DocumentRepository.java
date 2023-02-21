package repository.impl;

import model.Attribute;
import model.IDocument;
import repository.IDocumentRepository;

import java.util.ArrayList;
import java.util.List;

public class DocumentRepository implements IDocumentRepository {
    public static DocumentRepository documentRepository = null;
    public static DocumentRepository getInstance(){
        if(documentRepository == null){
            return new DocumentRepository();
        }
        return documentRepository;
    }
    List<IDocument> docs;
    DocumentRepository(){
        docs = new ArrayList<>();

    }
    @Override
    public void add(IDocument document){
        docs.add(document);
    }

    @Override
    public void update(IDocument document) {
//        docs = docs.stream().map(o -> o.get == document.getId() ? document : o)
//                                     .collect(toList());
    }

    @Override
    public void delete(Integer id) {
    // todo: delete
    }

    @Override
    public IDocument get(Integer id) {
        for (IDocument doc:docs){
            for(Attribute attribute:doc.getAttribute()){
                if(attribute.getName().equals("id") && attribute.getValue().equals(id)){
                    return doc;
                }
            }
        }
        return null;
    }

    @Override
    public List<IDocument> getAll() {
        return docs;
    }
}
