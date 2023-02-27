package model.actions;

import model.Attribute;
import model.CommonObject;
import model.documents.BaseDoc;
import model.documents.DocumentFactory;

import java.util.List;

public class AddAction extends Action {
    public static String ATT_DOCUMENT = "document";

    public AddAction(String message, List<BaseDoc> objs) {
        super(message, objs);
        attributes.add(new Attribute(ATT_DOCUMENT));
    }


    @Override
    public void doAction() {
        CommonObject document = DocumentFactory.getDocument(
                findIntegerValueByAttributeName(ATT_DOCUMENT));
        objs.add((BaseDoc) document.inputData());
    }
}
