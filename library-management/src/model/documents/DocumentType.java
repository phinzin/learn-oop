package model.documents;

import java.util.Arrays;

public enum DocumentType {
    Book(1, "BaseDoc.Book"),
    Magazine(2, "BaseDoc.Magazine"),
    Newspaper(3, "BaseDoc.Newspaper");

    public final Integer value;
    public final String name;

    DocumentType(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static DocumentType getEnumByValue(Integer code) {
        return Arrays.stream(DocumentType.values()).filter(att -> att.value.equals(code)).findFirst().get();
    }

    public static String getAllDocumentType() {
        String message = "";
        int count = 1;
        for (DocumentType e : DocumentType.values()) {
            message = message + count + "-" + e.name() + "\n";
            count++;
        }
        return message;
    }

    public static int getTotalEnumDocument() {
        return DocumentType.values().length;
    }

    public Integer getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
