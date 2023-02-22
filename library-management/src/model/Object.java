package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Object {
    List<Attribute> attributes;
    public Object(){
        attributes = new ArrayList<>();
        attributes.add(new Attribute("id"));
        attributes.add(new Attribute("publisher"));
        attributes.add(new Attribute("version"));

    }
    public Object inputData(){
        attributes.stream().filter(f -> f.isInput)
                  .forEach(Attribute::inputData);
        return this;
    }
    public Object findByAttribute(String name, String value){
        if (this.attributes.stream().filter(att -> att.getName().equals(name) && att.getValue().toString().equals(value)).findFirst().get() != null)
            return this;
        return null;
    }

    public void display() {
        System.out.println(this.getClass());
        attributes.stream().forEach(attr->attr.display());
    }
}
