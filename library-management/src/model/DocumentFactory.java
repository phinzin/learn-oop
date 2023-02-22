package model;


import java.security.InvalidParameterException;

public class DocumentFactory {
    public static CommonObject getDocument(Integer type) {
        switch (type) {
            case 1:
                return new Book();
            case 2:
                return new Magazine();
            case 3:
                return new Newspaper();
            default:
                throw new InvalidParameterException("1 ~ 3 please");
        }

    }

}
