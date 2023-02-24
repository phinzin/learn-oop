package model.documents;


import model.CommonObject;

import java.security.InvalidParameterException;

public class DocumentFactory {
    public static BaseDoc getDocument(DocumentType type) {

        switch (type) {
            case BOOK:
                return new Book();
            case MAGAZINE:
                return new Magazine();
            case NEWSPAPER:
                return new Newspaper();
            default:
                throw new InvalidParameterException("1 ~ 3 please");
        }

    }

}
