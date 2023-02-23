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
                           .filter(att -> att.getName().equals(name)
                                   && (att.getValue().toString().equals(value) || value == null)
                           )
                           .findFirst()
                           .get() != null) return this;
        return null;
    }

    public String findStringValueByAttributeName(String name) {
        return this.attributes.stream()
                              .filter(att -> att.getName().equals(name))
                              .findFirst()
                              .get().getValue().toString();

    }

    public Integer findIntegerValueByAttributeName(String name) {
        return Integer.parseInt(this.attributes.stream()
                                               .filter(att -> att.getName().equals(name))
                                               .findFirst()
                                               .get().getValue().toString());

    }

    public void display() {
        System.out.println(this.getClass());
        attributes.stream().forEach(attr -> attr.display());
    }
}
