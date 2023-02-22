package model;

import java.util.List;

public class AddAction extends Action {
    public AddAction(String message, List<CommonObject> objs) {
        super(message, objs);
        attributes.add(new Attribute("document"));
    }


    @Override
    public void doAction() {
        CommonObject document = DocumentFactory.getDocument(Integer.parseInt(this.attributes.get(0).getValue().toString()));
        objs.add(document.inputData());
    }
}
