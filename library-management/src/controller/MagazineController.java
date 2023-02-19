package controller;

import model.Constants;
import model.Document;
import model.Magazine;
import services.impl.MagazineManagement;

import java.io.IOException;
import java.util.Scanner;

public class MagazineController implements DocumentController{
    MagazineManagement magazineManagement;

    public MagazineController() {
        magazineManagement = new MagazineManagement();
    }
    private static MagazineController intance = null;
    public static MagazineController getInstance(){
        if(intance == null){
            intance = new MagazineController();
        }
        return intance;
    }
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("id: ");
        int magazineId = Integer.parseInt(scanner.nextLine());
        System.out.print("publisher: ");
        String magazinePublisher = scanner.nextLine();
        System.out.print("version: ");
        String magazineVersion = scanner.nextLine();
        System.out.print("noOfPublisher: ");
        int noOfPublisher = Integer.parseInt(scanner.nextLine());
        System.out.print("publishMonth: ");
        String publishMonth = scanner.nextLine();
        Document magazine = new Magazine.Builder(magazineId, magazinePublisher,
                                                 magazineVersion).withNoOfPublisher(
                noOfPublisher).withPublishMonth(publishMonth).build();

        try {
            magazineManagement.add(magazine);
            System.out.println(String.format(Constants.ADD_SUCCESS, "Book"));
        } catch (IOException e) {
            System.out.println("can't add due to: " + e.getMessage());
        }
    }
}
