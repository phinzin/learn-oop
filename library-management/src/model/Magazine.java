package model;

public class Magazine extends BaseDoc {
    public Magazine() {
        attributes.add(new Attribute("noOfPublisher"));
        attributes.add(new Attribute("publishMonth"));
        attributes.add(new Attribute("type", "Magazine", Boolean.FALSE));
    }

}
