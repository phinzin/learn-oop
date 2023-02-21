package model;

public class Attribute {
    String name;
    Object value;

//    private Attribute(){}
//    private Attribute(Builder builder){
//        this.name = builder.name;
//        this.value = builder.value;
//    }
//    public static class Builder{
//        String name;
//        Object value;
//        public Builder(){}
//        public Builder withName(String name){
//            this.name = name;
//            return this;
//        }
//        public Builder withValue(Object value){
//            this.value = value;
//            return this;
//        }
//        public Attribute build(){
//            return new Attribute(this);
//        }
//    }
    public Attribute(String name, Object value){
        this.name = name;
        this.value = value;
    }
    @Override
    public String toString() {
        return "Attribute{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
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

    public void setValue(Object value) {
        this.value = value;
    }
}
