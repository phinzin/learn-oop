package model;

import java.util.List;

public class ExitAction extends Action {
    public ExitAction(String message, List<Object> objs) {
        super(message, objs);

    }


    @Override
    public void doAction() {
        objs.clear();
        System.exit(0);
    }
}
