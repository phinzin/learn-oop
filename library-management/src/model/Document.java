package model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class Document {
    Integer id;
    String publisher;
    String version;

}
