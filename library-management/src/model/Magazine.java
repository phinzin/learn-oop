package model;

public class Magazine extends Document {
    Integer noOfPublisher;
    String publishMonth;

    private Magazine(Integer id, String publisher, String version) {
        super(id, publisher, version);
    }

    private Magazine(Builder builder) {
        super(builder.id, builder.publisher, builder.version);
        this.noOfPublisher = builder.noOfPublisher;
        this.publishMonth = builder.publishMonth;
    }

    public static class Builder {
        Integer id;
        String publisher;
        String version;
        Integer noOfPublisher;
        String publishMonth;

        public Builder(Integer id, String publisher, String version) {
            this.id = id;
            this.publisher = publisher;
            this.version = version;
        }

        public Builder withNoOfPublisher(Integer noOfPublisher) {
            this.noOfPublisher = noOfPublisher;
            return this;
        }

        public Builder withPublishMonth(String publishMonth) {
            this.publishMonth = publishMonth;
            return this;
        }

        public Magazine build() {
            return new Magazine(this);
        }
    }

    public Integer getNoOfPublisher() {
        return noOfPublisher;
    }

    public String getPublishMonth() {
        return publishMonth;
    }
}
