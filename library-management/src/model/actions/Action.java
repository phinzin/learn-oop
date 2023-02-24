package model.actions;

import model.CommonObject;
import model.documents.BaseDoc;

import java.util.List;

public abstract class Action extends CommonObject {
    String message = null;
    List<BaseDoc> objs = null;

    public Action(String message, List<BaseDoc> objs) {
        this.message = message;
        this.objs = objs;

    }

    public void execute() {
        System.out.println(message);
        this.inputData();
        doAction();

    }

    public abstract void doAction();
}
