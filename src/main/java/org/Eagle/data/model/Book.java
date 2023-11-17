package org.Eagle.data.model;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document("/Book")
public class Book {
    private String title;
    private String creator;
    private String content;
    private LocalDate date;
    private LocalDate createdDate;
}
