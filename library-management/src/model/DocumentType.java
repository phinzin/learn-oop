package model;

public enum DocumentType {
    BOOK(1),
    MAGAZINE(2),
    NEWSPAPER(3);

    public final Integer value;

    private DocumentType(Integer value){
        this.value = value;
    }
    public static DocumentType getEnumByValue(Integer code){
        for(DocumentType e : DocumentType.values()){
            if(e.value.equals(code)) return e;
        }
        return null;
    }
}
