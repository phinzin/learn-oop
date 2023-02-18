package model;

public class Newspaper extends Document {
    String publishOn;

    private Newspaper(Integer id, String publisher, String version) {
        super(id, publisher, version);
    }

    private Newspaper(Builder builder) {
        super(builder.id, builder.publisher, builder.version);
        this.publishOn = builder.publishOn;
    }

    public static class Builder {
        Integer id;
        String publisher;
        String version;
        String publishOn;

        public Builder(Integer id,
                       String publisher,
                       String version) {
            this.id = id;
            this.publisher = publisher;
            this.version = version;
        }

        public Builder withPublishOn(String publishOn) {
            this.publishOn = publishOn;
            return this;
        }

        public Newspaper build() {
            return new Newspaper(this);
        }
    }
}
