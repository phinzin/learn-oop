package model.actions;

import model.Attribute;
import model.CommonObject;
import model.documents.BaseDoc;

import java.util.List;

public class DeleteAction extends Action {
    public static String ATT_NAME = "name";
    public static String ATT_VALUE = "value";

    public DeleteAction(String message, List<BaseDoc> objs) {
        super(message, objs);
        attributes.add(new Attribute(ATT_NAME));
        attributes.add(new Attribute(ATT_VALUE));
    }


    @Override
    public void doAction() {
        CommonObject findDoc = null;
        for (CommonObject commonDocument : objs) {
            if (commonDocument.findByAttribute(this.findStringValueByAttributeName(ATT_NAME),
                                               this.findStringValueByAttributeName(ATT_VALUE)) != null) {
                findDoc = commonDocument;
                break;
            }
        }
        objs.remove(findDoc);

    }
}
