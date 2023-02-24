package model.documents;

import model.Attribute;
import model.CommonObject;

public class BaseDoc extends CommonObject {
    public BaseDoc(){
        super();
        attributes.add(new Attribute("id"));
        attributes.add(new Attribute("publisher"));
        attributes.add(new Attribute("version"));
    }
}
