package model;


import java.security.InvalidParameterException;
import java.util.Scanner;

public class DocumentFactory {
    public static Document getDocument(Integer type){
        Scanner scanner = new Scanner(System.in);
        switch (type){
            case 1:

                System.out.print("\nBook id: ");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.print("Book publisher: ");
                String publisher = scanner.nextLine();
                System.out.print("Book version: ");
                String version = scanner.nextLine();
                System.out.print("Book author: ");
                String author = scanner.nextLine();
                System.out.print("Book noOfPages: ");
                int noOfPages = Integer.parseInt(scanner.nextLine());
                return new Book.Builder(id,publisher,version).withAuthor(author).withNoOfPages(noOfPages).build();
            case 2:
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
                return new Magazine.Builder(magazineId, magazinePublisher,
                                                         magazineVersion).withNoOfPublisher(
                        noOfPublisher).withPublishMonth(publishMonth).build();

            case 3:
                System.out.print("id: ");
                int newspaperId = Integer.parseInt(scanner.nextLine());
                System.out.print("publisher: ");
                String newspaperPublisher = scanner.nextLine();
                System.out.print("version: ");
                String newspaperVersion = scanner.nextLine();
                System.out.print("publish on: ");
                String publishOn = scanner.nextLine();
                return new Newspaper.Builder(newspaperId, newspaperPublisher,
                                                           newspaperVersion).withPublishOn(publishOn)
                                                                            .build();
            default:
                throw new InvalidParameterException("in valid input, only 1~3 is applicable!");
        }
    }

}
