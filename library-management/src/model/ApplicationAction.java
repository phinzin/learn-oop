package model;

import java.util.List;

public class ApplicationAction extends Action {
    Action[] actions;

    public ApplicationAction(String message, List<CommonObject> objs) {
        super(message, objs);
        attributes.add(new Attribute("function"));
        actions = new Action[]{
                new AddAction(Constants.PLEASE_SELECT_DOC_TYPE + "\n" + Constants.ADD_DOC_MENU, objs),
                new DeleteAction(Constants.ID_TO_DELETE, objs),
                new DisplayAction(Constants.DISPLAY_ALL_DOCS, objs),
                new ExitAction(Constants.EXIT, objs),
                new DefaultAction(Constants.INCORRECT_OPTIONS_MSG, objs)
        };
    }


    @Override
    public void doAction() {
        int selectedMenuOptions = Integer.parseInt(this.attributes.get(0).getValue().toString());
        actions[selectedMenuOptions - 1].execute();
        execute();
    }
}
