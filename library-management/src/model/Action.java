package model;

import java.util.List;

public abstract class Action extends Object {
    String message = null;
    List<Object> objs = null;

    public Action(String message, List<Object> objs) {
        this.message = message;
        this.attributes.clear();
        this.objs = objs;


    }

    public void excute() {
        System.out.println(message);
        this.inputData();
        doAction();

    }

    public abstract void doAction();
}
