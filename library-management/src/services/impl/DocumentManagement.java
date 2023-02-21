package services.impl;

import model.IDocument;
import repository.impl.DocumentRepository;
import services.DocumentActions;

public class DocumentManagement implements DocumentActions {
    private static DocumentManagement documentManagement;
    public static DocumentManagement getInstance(){
        if(documentManagement == null){
            documentManagement = new DocumentManagement();
        }
        return documentManagement;
    }
    DocumentRepository documentRepository;
    DocumentManagement(){
        documentRepository = DocumentRepository.getInstance();
    }
    @Override
    public void delete(Integer id) {
        documentRepository.delete(id);
    }

    @Override
    public void display() {
        documentRepository.getAll().stream().forEach(doc-> System.out.println(doc.toString()));
    }

    @Override
    public IDocument search(Integer id) {
        return documentRepository.get(id);
    }

    @Override
    public void add(IDocument document){
        documentRepository.add(document);
    }
}
