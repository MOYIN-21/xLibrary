package org.Eagle.services;

import org.Eagle.data.model.Book;
import org.Eagle.data.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookServiceInter{
    @Autowired
    private BookRepo bookRepo;


    @Override
    public Book findBookByCreatorAndTitle(String creator, String title) {
        for (Book book : bookRepo.findAll())
            if (book.getCreator().equalsIgnoreCase(creator) && book.getTitle().equalsIgnoreCase(title))
                return book;
        throw new NullPointerException("Book by creator or title does not exist");
    }
}
