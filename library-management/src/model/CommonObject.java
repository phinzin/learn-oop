package model;

import java.util.ArrayList;
import java.util.List;

public abstract class CommonObject {
    List<Attribute> attributes;

    public CommonObject() {
        attributes = new ArrayList<>();
    }

    public CommonObject inputData() {
        attributes.stream().filter(f -> f.isInput).forEach(Attribute::inputData);
        return this;
    }

    public CommonObject findByAttribute(String name, String value) {
        if (this.attributes.stream()
                           .filter(att -> att.getName().equals(name) && att.getValue().toString().equals(value))
                           .findFirst()
                           .get() != null) return this;
        return null;
    }

    public void display() {
        System.out.println(this.getClass());
        attributes.stream().forEach(attr -> attr.display());
    }
}
