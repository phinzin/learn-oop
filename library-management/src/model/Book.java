package model;

public class Book extends Object {
    public Book(){
        attributes.add(new Attribute("author"));
        attributes.add(new Attribute("noOfPages"));
        attributes.add(new Attribute("type","Book",Boolean.FALSE));
    }


}
