package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Magazine implements IDocument {

    List<Attribute> attributes;
    private Magazine() {

    }

    public Magazine(Builder builder) {
        this.attributes = builder.attributes;
    }

    public static class Builder implements IBuilder{
        private List<Attribute> attributes;
        public Builder(){
            this.attributes = new ArrayList<>();
        }
        public Builder withAttribute(Attribute attribute){
            this.attributes.add(attribute);
            return this;
        }
        public IDocument build(){
            return new Magazine(this);
        }
    }

    public void display(){
        for (Attribute attribute: attributes){
            System.out.println(attribute.toString());
        }
    }
    public Object getAttributeValueByName(String name) {
        for (Attribute attribute:attributes){
            if (attribute.getName().equals(name) ){
                return attribute.getValue();
            }
        }
        return null;
    }
    public List<Attribute> getAttribute() {
        return this.attributes;
    }
    public String toString() {
        return Arrays.toString(attributes.toArray())+"\n";
    }
}
