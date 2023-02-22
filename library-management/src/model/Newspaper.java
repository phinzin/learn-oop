package model;

public class Newspaper extends Object {

        public Newspaper(){
            attributes.add(new Attribute("publishOn"));
            attributes.add(new Attribute("type","Newspaper",Boolean.FALSE));
        }
}
