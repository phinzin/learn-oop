package model;

public interface IBuilder {
    IBuilder withAttribute(Attribute attribute);
    IDocument build();
}
