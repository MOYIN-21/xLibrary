package org.Eagle.services;

import org.Eagle.data.model.Book;
import org.Eagle.data.model.User;
import org.Eagle.dtos.CreateLibraryAccount;
import org.springframework.stereotype.Service;

public interface UserServicesInter{
    Book findBookByTitle(String title);
    Book findBookByCreatorAndTitle(String userName, String title);
    Book findBookByCreator(String creator);
    void readBook();

    String register(CreateLibraryAccount user);
}
