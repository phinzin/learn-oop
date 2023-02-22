package model;

import java.util.List;

public abstract class Action extends CommonObject {
    String message = null;
    List<CommonObject> objs = null;

    public Action(String message, List<CommonObject> objs) {
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
