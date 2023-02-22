package model;

import java.util.List;

public class DefaultAction extends Action {
    public DefaultAction(String message, List<CommonObject> objs) {
        super(message, objs);
        attributes.add(new Attribute("document"));
    }


    @Override
    public void doAction() {

    }
}
