package controller;

import model.Constants;
import model.Document;
import model.Newspaper;
import services.impl.NewspaperManagement;

import java.io.IOException;
import java.util.Scanner;

public class NewspaperController implements DocumentController{
    NewspaperManagement newspaperManagement;

    public NewspaperController() {
        newspaperManagement = new NewspaperManagement();
    }

    private static NewspaperController instance;
    public static NewspaperController getInstance(){
        if(instance == null){
            instance = new NewspaperController();
        }
        return instance;
    }
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("id: ");
        int newspaperId = Integer.parseInt(scanner.nextLine());
        System.out.print("publisher: ");
        String newspaperPublisher = scanner.nextLine();
        System.out.print("version: ");
        String newspaperVersion = scanner.nextLine();
        System.out.print("Book author: ");
        String publishOn = scanner.nextLine();
        Document newspaper = new Newspaper.Builder(newspaperId, newspaperPublisher,
                                                   newspaperVersion).withPublishOn(publishOn)
                                                                    .build();
        try {
            newspaperManagement.add(newspaper);
            System.out.println(String.format(Constants.ADD_SUCCESS, "Book"));
        } catch (IOException e) {
            System.out.println("can't add due to: " + e.getMessage());
        }
    }
}
