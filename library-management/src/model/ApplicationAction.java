package model;

import java.util.List;

public class ApplicationAction extends Action {
    Action[] actions;
    public static String ATT_FUNCTION = "function";
    public ApplicationAction(String message, List<CommonObject> objs) {
        super(message, objs);
        attributes.add(new Attribute(ATT_FUNCTION));
        actions = new Action[]{
                new AddAction(Constants.PLEASE_SELECT_DOC_TYPE + "\n" + Constants.ADD_DOC_MENU, objs),
                new DeleteAction(Constants.ID_TO_DELETE, objs),
                new DisplayAction(Constants.DISPLAY_ALL_DOCS, objs),
                new SearchAction(Constants.SEARCH_DOCUMENT, objs),
                new ExitAction(Constants.EXIT, objs),
                new DefaultAction(Constants.INCORRECT_OPTIONS_MSG, objs)
        };
    }


    @Override
    public void doAction() {
        actions[findIntegerValueByAttributeName(ATT_FUNCTION) - 1].execute();
        this.execute();
    }
}
