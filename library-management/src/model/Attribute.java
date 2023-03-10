package model;

import java.util.Scanner;

public class Attribute {
    String name;
    Object value;

    boolean isInput = Boolean.TRUE;

    public Attribute(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public Attribute(String name, Object value, Boolean isInput) {
        this.name = name;
        this.value = value;
        this.isInput = isInput;
    }

    public Attribute(String name) {
        this.name = name;
    }

    public void setValue(CommonObject value) {
        this.value = value;
    }

    public void inputData() {
        System.out.println("input " + this.name + ": ");
        this.value = new Scanner(System.in).nextLine();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getValue() {
        return value;
    }

    public boolean isInput() {
        return isInput;
    }

    public void setInput(boolean input) {
        isInput = input;
    }

    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format("Attribute{name = %s, value= %s, isInput= %s}",name,value,isInput);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Attribute){
            Attribute compareObj = (Attribute) obj;
            if (this.getName().equals(compareObj.getName())  &&
                this.getValue().equals(compareObj.getValue())
            ) return true;
        }
        return  Boolean.FALSE;
    }
}
