package controller;

import model.DocumentType;

public class DocumentControllerFactory {
    public static DocumentController getController(int type) {
        switch (type) {
            case 1:
                return BookController.getInstance();
            case 2:
                return MagazineController.getInstance();
            case 3:
                return NewspaperController.getInstance();
        }
        return null;
    }

}
