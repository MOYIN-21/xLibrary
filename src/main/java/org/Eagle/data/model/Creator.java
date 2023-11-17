package org.Eagle.data.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("/Creator")
public class Creator {
    private String password;
    private String userName;
}
