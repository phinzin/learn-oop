import model.AddAction;
import model.ApplicationAction;
import model.Constants;
import model.DefaultAction;
import model.DeleteAction;
import model.DisplayAction;
import model.ExitAction;
import model.Object;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
       List<Object> docs = new ArrayList<>();
//       Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        new ApplicationAction(Constants.PLEASE_SELECT_MENU_OPTIONS + "\n" + Constants.ROOT_MENU,docs).excute();
//        scanner.close();
    }
}
