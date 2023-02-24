package model.actions;

import model.Attribute;
import model.documents.BaseDoc;

import java.util.List;

public class DefaultAction extends Action {
    public DefaultAction(String message, List<BaseDoc> objs) {
        super(message, objs);
        attributes.add(new Attribute("document"));
    }


    @Override
    public void doAction() {

    }
}
