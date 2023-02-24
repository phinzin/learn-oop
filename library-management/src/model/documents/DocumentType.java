package model.documents;

import java.util.Arrays;

public enum DocumentType {
    BOOK(1),
    MAGAZINE(2),
    NEWSPAPER(3);

    public final Integer value;

    DocumentType(Integer value) {
        this.value = value;
    }

    public static DocumentType getEnumByValue(Integer code) {
        return Arrays.stream(DocumentType.values())
                     .filter(e->e.value.equals(code)).findFirst().get();
    }
}
