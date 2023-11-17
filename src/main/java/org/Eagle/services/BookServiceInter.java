package org.Eagle.services;
import org.Eagle.data.model.Book;
import org.springframework.stereotype.Service;

@Service

public interface BookServiceInter {
    Book findBookByTitle(String title);
    Book findBookByCreatorAndTitle(String userName, String title);
    Book findBookByCreator(String creator);

}
