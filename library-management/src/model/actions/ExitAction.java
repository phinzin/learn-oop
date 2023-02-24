package model.actions;

import model.documents.BaseDoc;

import java.util.List;

public class ExitAction extends Action {
    public ExitAction(String message, List<BaseDoc> objs) {
        super(message, objs);

    }


    @Override
    public void doAction() {
        objs.clear();
        System.exit(0);
    }
}
