package org.Eagle.data.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("/library")
public class Library {
    private String userName;
    private String password;
    private boolean isLocked;
    private Shelf shelf;
}
