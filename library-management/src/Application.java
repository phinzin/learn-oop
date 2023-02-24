import model.actions.ApplicationAction;
import model.Constants;
import model.CommonObject;
import model.documents.BaseDoc;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        new ApplicationAction(new StringBuilder(Constants.PLEASE_SELECT_MENU_OPTIONS)
                                      .append(Constants.NEW_LINE)
                                      .append(Constants.ROOT_MENU)
                                      .append(Constants.NEW_LINE)
                                      .toString(), new ArrayList<BaseDoc>()).execute();
    }
}
