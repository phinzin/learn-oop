import model.ApplicationAction;
import model.Constants;
import model.Object;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Object> docs = new ArrayList<>();
        new ApplicationAction(Constants.PLEASE_SELECT_MENU_OPTIONS + "\n" + Constants.ROOT_MENU, docs).excute();
    }
}
