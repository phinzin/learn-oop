import controller.BookController;
import controller.MagazineController;
import controller.NewspaperController;
import model.Constants;

import java.util.Scanner;

public class LibraryManagement {
    public static void main(String[] args) {
        boolean shouldContinue = true;
        BookController bookController = new BookController();
        MagazineController magazineController = new MagazineController();
        NewspaperController newspaperController = new NewspaperController();
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        do {
            System.out.println(Constants.PLEASE_SELECT_MENU_OPTIONS + "\n" + Constants.ROOT_MENU);
            int selectedMenuOptions = Integer.parseInt(scanner.nextLine());
            System.out.println("selectedMenuOptions: " + selectedMenuOptions);
            switch (selectedMenuOptions) {
                case 1:
                    boolean continueAdding = true;
                    do {
                        System.out.println(Constants.PLEASE_SELECT_DOC_TYPE + "\n" + Constants.ADD_DOC_MENU);
                        switch (Integer.parseInt(scanner.nextLine())) {
                            case 1:
                                System.out.println("add book");
                                bookController.add();
                                break;
                            case 2:
                                System.out.println("add newspaper");
                                newspaperController.add();
                                break;
                            case 3:
                                System.out.println("add magazine");
                                magazineController.add();
                                break;
                            case 4:
                                System.out.println("go back!");
                                continueAdding = false;
                                break;
                            case 5:
                                System.out.println("exit");
                                return;
                            default:
                                System.out.println(Constants.INCORRECT_OPTIONS_MSG);
                        }
                    } while (continueAdding);
                    break;
                case 2:
                    System.out.println("selected 2");
                    break;
                case 3:
                    System.out.println("selected 3");
                    break;
                case 4:
                    System.out.println("selected 4");
                    break;
                case 5:
                    System.out.println("selected 5");
                    shouldContinue = false;
                    break;
                default:
                    System.out.println(Constants.INCORRECT_OPTIONS_MSG);
            }
        } while (shouldContinue);
        scanner.close();
    }
}
