package model;

import java.util.List;

public class DeleteAction extends Action {
    public DeleteAction(String message, List<CommonObject> objs) {
        super(message, objs);
        attributes.add(new Attribute("name"));
        attributes.add(new Attribute("value"));
    }


    @Override
    public void doAction() {
        CommonObject findDoc = null;
        for (CommonObject commonDocument : objs) {
            if (commonDocument.findByAttribute(this.attributes.get(0).getValue().toString(),
                                               this.attributes.get(1).getValue().toString()) != null) {
                findDoc = commonDocument;
            }
        }
        objs.remove(findDoc);

    }
}
