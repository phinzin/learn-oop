package model;

import java.util.List;

public class SearchAction extends Action {
    public static String ATT_NAME = "name";
    public static String ATT_VALUE = "value";

    public SearchAction(String message, List<CommonObject> objs) {
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
        if (findDoc == null) {
            System.out.println("not found!");
            return;
        }
        findDoc.display();
    }
}