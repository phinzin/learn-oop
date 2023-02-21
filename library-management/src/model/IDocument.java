package model;

import java.util.List;

public interface IDocument{
    Object getAttributeValueByName(String name);
    List<Attribute> getAttribute();
}
