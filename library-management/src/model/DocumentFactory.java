package model;


import java.security.InvalidParameterException;
import java.util.Scanner;

public class DocumentFactory {
    public static IDocument getDocument(Integer type){
        Scanner scanner = new Scanner(System.in);
        IBuilder builder;
        boolean shouldContinue = true;
        switch (type){
            case 1:
                builder = new Book.Builder();
                break;
            case 2:
                builder = new Magazine.Builder();
                break;
            case 3:
                builder = new Newspaper.Builder();
                break;
            default:
                throw new InvalidParameterException("1 ~ 3 please");
        }
        while (shouldContinue){
            System.out.print("\nname: ");
            String prop = scanner.nextLine();
            System.out.print("\nvalue: ");
            String value = scanner.nextLine();
            if(!scanner.nextLine().equals("")){
                shouldContinue = false;
            }
            builder.withAttribute(new Attribute(prop,value));
        }
        return builder.build();
    }

}
