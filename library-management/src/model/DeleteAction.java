package model;

import java.util.List;

public class DeleteAction extends Action {
    public static String ATT_NAME = "name";
    public static String ATT_VALUE = "value";

    public DeleteAction(String message, List<CommonObject> objs) {
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
            }
        }
        objs.remove(findDoc);

    }
}
