package model.documents;

import model.Attribute;

public class Book extends BaseDoc {
    public Book() {
        attributes.add(new Attribute("author"));
        attributes.add(new Attribute("noOfPages"));
        attributes.add(new Attribute("type", "Book", Boolean.FALSE));
    }


}
