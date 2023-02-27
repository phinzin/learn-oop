package model.actions;

import model.Attribute;
import model.CommonObject;
import model.Constants;
import model.documents.BaseDoc;
import model.documents.DocumentFactory;

import java.security.InvalidParameterException;
import java.util.List;

import static model.documents.DocumentType.getTotalEnumDocument;

public class AddAction extends Action {
    public static String ATT_DOCUMENT = "document";

    public AddAction(String message, List<BaseDoc> objs) {
        super(message, objs);
        attributes.add(new Attribute(ATT_DOCUMENT));
    }


    @Override
    public void doAction() {
        CommonObject document = null;
        try {
            document = DocumentFactory.getDynamicDocument(
                    findIntegerValueByAttributeName(ATT_DOCUMENT));
        } catch (Exception e) {
            throw new InvalidParameterException(Constants.INPUT_ERROR + getTotalEnumDocument());
        }
        objs.add((BaseDoc) document.inputData());
    }
}
