import model.Action;
import model.Constants;
import model.DocumentFactory;
import model.IDocument;
import services.impl.DocumentManagement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws IOException {
        List<Action> actions = new ArrayList<Action>();
        boolean shouldContinue = true;
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        do {
            System.out.println(Constants.PLEASE_SELECT_MENU_OPTIONS + "\n" + Constants.ROOT_MENU);
            int selectedMenuOptions = Integer.parseInt(scanner.nextLine());
            System.out.println("selectedMenuOptions: " + selectedMenuOptions);
            switch (selectedMenuOptions) {
                case 1:
                    System.out.println(Constants.PLEASE_SELECT_DOC_TYPE + "\n" + Constants.ADD_DOC_MENU);
                    IDocument document = DocumentFactory.getDocument(Integer.parseInt(scanner.nextLine()));
                    DocumentManagement.getInstance().add(document);
                    break;
                case 2:
                    System.out.print(Constants.ID_TO_DELETE);
                    DocumentManagement.getInstance().delete(Integer.parseInt(scanner.nextLine()));
                    break;
                case 3:
                    DocumentManagement.getInstance().display();
                    break;
                case 4:
                    System.out.println(Constants.PLEASE_SELECT_DOC_TYPE + "\n" + Constants.ADD_DOC_MENU);
                    IDocument doc = DocumentManagement.getInstance().search(Integer.parseInt(scanner.nextLine()));
                    System.out.println(doc.toString());
                    break;
                case 5:
                    shouldContinue = false;
                    break;
                default:
                    System.out.println(Constants.INCORRECT_OPTIONS_MSG);
            }
        } while (shouldContinue);
        scanner.close();
    }
}
