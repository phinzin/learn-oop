package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book implements IDocument {

    List<Attribute> attributes;
    private Book() {

    }

    public Book(Book.Builder builder) {
        this.attributes = builder.attributes;
    }

    @Override
    public Object getAttributeValueByName(String name) {
        for (Attribute attribute:attributes){
            if (attribute.getName().equals(name) ){
                return attribute.getValue();
            }
        }
        return null;
    }

    @Override
    public List<Attribute> getAttribute() {
        return this.attributes;
    }

    public static class Builder implements IBuilder{
        List<Attribute> attributes;
        public Builder(){
            attributes = new ArrayList<>();
        }
        public IBuilder withAttribute(Attribute attribute){
            attributes.add(attribute);
            return this;
        }
        public IDocument build(){
            return new Book(this);
        }
    }

    public void display(){
        for (Attribute attribute: attributes){
            System.out.println(attribute.toString());
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(attributes.toArray())+"\n";
    }
}
