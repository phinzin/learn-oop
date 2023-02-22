package model;

import java.util.List;
import java.util.Scanner;

public class ApplicationAction extends Action {
    public ApplicationAction(String message, List<Object> objs) {
        super(message, objs);
        attributes.add(new Attribute("function"));
    }


    @Override
    public void doAction() {
        int selectedMenuOptions = Integer.parseInt(this.attributes.get(0).getValue().toString());
        Scanner scanner = new Scanner(System.in);

        switch (selectedMenuOptions) {
            case 1:
                new AddAction(Constants.PLEASE_SELECT_DOC_TYPE + "\n" + Constants.ADD_DOC_MENU, objs).excute();
                break;
            case 2:
                new DeleteAction(Constants.ID_TO_DELETE, objs).excute();
                break;
            case 3:
                new DisplayAction(Constants.DISPLAY_ALL_DOCS, objs).excute();
                break;
            case 5:
                new ExitAction(Constants.EXIT, objs).excute();
                break;
            default:
                new DefaultAction(Constants.INCORRECT_OPTIONS_MSG, objs).excute();

        }
        this.doAction();

    }
}
