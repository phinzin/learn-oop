package model;

import java.util.List;

public class AddAction extends Action {
    public static String ATT_DOCUMENT = "document";
    public AddAction(String message, List<CommonObject> objs) {
        super(message, objs);
        attributes.add(new Attribute(ATT_DOCUMENT));
    }


    @Override
    public void doAction() {
        CommonObject document = DocumentFactory.getDocument(
                                    DocumentType.getEnumByValue(
                                        findIntegerValueByAttributeName(ATT_DOCUMENT)));
        objs.add(document.inputData());
    }
}
