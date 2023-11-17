package org.Eagle.services;

import org.Eagle.data.model.Book;
import org.Eagle.data.model.User;
import org.Eagle.data.repository.BookRepo;
import org.Eagle.data.repository.UserRepo;
import org.Eagle.dtos.CreateLibraryAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static org.Eagle.utils.map.map;

@Service
public class UserServicesImpl implements UserServicesInter{
    @Autowired
    private BookRepo bookServicesInter;
    @Autowired
    private UserRepo userRepo;

    @Override
    public Book findBookByTitle(String title) {
        for (Book book: bookServicesInter.findAll())
            if (book.getTitle().equalsIgnoreCase(title))
                return book;
        throw new NullPointerException("book with title does not exist");
    }

    @Override
    public Book findBookByCreatorAndTitle(String userName, String title) {
        return null;
    }

    @Override
    public Book findBookByCreator(String creator) {
            for (Book book: bookServicesInter.findAll())
                if (book.getCreator().equalsIgnoreCase(creator))
                    return book;
            throw new NullPointerException("book with Creator does not exist");
        }

        @Override
    public void readBook() {

    }

    @Override
    public String register(CreateLibraryAccount createLibraryAccount) {
        User user = new User();
        map(createLibraryAccount, user);
        userRepo.save(user);
        return "Account created successfully";
    }
}
