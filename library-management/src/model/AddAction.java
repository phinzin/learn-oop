package model;

import java.util.List;

public class AddAction extends Action {
    public AddAction(String message, List<Object> objs) {
        super(message, objs);
        attributes.add(new Attribute("document"));
    }


    @Override
    public void doAction() {
        Object document = DocumentFactory.getDocument(Integer.parseInt(this.attributes.get(0).getValue().toString()));
        objs.add(document.inputData());
    }
}
