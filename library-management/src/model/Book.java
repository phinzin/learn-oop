package model;

public class Book extends Document {
    private String author;
    private Integer noOfPages;

    private Book(Builder builder) {
        super(builder.id, builder.publisher, builder.version);
        this.author = builder.author;
        this.noOfPages = builder.noOfPages;
    }

    public static class Builder {
        private Integer id;
        private String publisher;
        private String version;
        private String author;
        private Integer noOfPages;

        public Builder(Integer id, String publisher, String version) {
            this.id = id;
            this.publisher = publisher;
            this.version = version;
        }

        public Builder withAuthor(String author) {
            this.author = author;
            return this;
        }

        public Builder withNoOfPages(Integer noOfPages) {
            this.noOfPages = noOfPages;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }

    public String getAuthor() {
        return author;
    }

    public Integer getNoOfPages() {
        return noOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", publisher='" + publisher + '\'' +
                ", version='" + version + '\'' +
                ", author='" + author + '\'' +
                ", noOfPages=" + noOfPages +
                '}';
    }
}
