import model.ApplicationAction;
import model.Constants;
import model.CommonObject;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        new ApplicationAction(new StringBuilder(Constants.PLEASE_SELECT_MENU_OPTIONS)
                                      .append(Constants.NEW_LINE)
                                      .append(Constants.ROOT_MENU)
                                      .append(Constants.NEW_LINE)
                                      .toString(), new ArrayList<CommonObject>()).execute();
    }
}
