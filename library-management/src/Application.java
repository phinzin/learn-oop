import model.ApplicationAction;
import model.Constants;
import model.CommonObject;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<CommonObject> docs = new ArrayList<>();
        new ApplicationAction(Constants.PLEASE_SELECT_MENU_OPTIONS + "\n" + Constants.ROOT_MENU, docs).execute();
    }
}
