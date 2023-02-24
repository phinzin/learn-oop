package model.actions;

import model.documents.BaseDoc;

import java.util.List;

public class DisplayAction extends Action {
    public DisplayAction(String message, List<BaseDoc> objs) {
        super(message, objs);
    }

    @Override
    public void doAction() {
        objs.stream().forEach(doc -> doc.display());
    }
}
