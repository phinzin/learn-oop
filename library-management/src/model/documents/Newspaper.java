package model.documents;

import model.Attribute;

public class Newspaper extends BaseDoc {

    public Newspaper() {
        attributes.add(new Attribute("publishOn"));
        attributes.add(new Attribute("type", "Newspaper", Boolean.FALSE));
    }
}
