package org.Eagle.data.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;
@Data
@Document("/shelf")
public class Shelf {
    private List<Book> books = new ArrayList<>();
}
