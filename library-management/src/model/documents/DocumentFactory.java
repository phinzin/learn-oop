package model.documents;


import model.Constants;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class DocumentFactory {
//    public static BaseDoc getDocument(DocumentType type) {

//        switch (type) {
//            case BOOK:
//                return new Book();
//            case MAGAZINE:
//                return new Magazine();
//            case NEWSPAPER:
//                return new Newspaper();
//            default:
//                throw new InvalidParameterException("1 ~ 3 please");
//        }

    //    }
    static List<Supplier<BaseDoc>> supplierList = new ArrayList<>(
            Arrays.asList(Book::new, Magazine::new, Newspaper::new));

    public static BaseDoc getDocument(Integer docType) {
        if (docType > supplierList.size()) {
            throw new InvalidParameterException(Constants.INPUT_ERROR + getTotalEnumDocument());
        }
        return supplierList.get(docType - 1).get();
    }

    public static Integer getTotalEnumDocument() {
        return supplierList.size();
    }
}
