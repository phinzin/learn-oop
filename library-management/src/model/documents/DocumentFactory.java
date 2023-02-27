package model.documents;

import java.lang.reflect.InvocationTargetException;

import static model.documents.DocumentType.getEnumByValue;

public class DocumentFactory {
    //Code when init Dynamic Constructor
    public static BaseDoc getDynamicDocument(Integer docType) throws ClassNotFoundException, NoSuchMethodException,
            InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> cl = Class.forName(getEnumByValue(docType).getName());
        return (BaseDoc) cl.getConstructor().newInstance();
    }
}
