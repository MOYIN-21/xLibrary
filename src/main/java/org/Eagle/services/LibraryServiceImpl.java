package org.Eagle.services;

import org.Eagle.data.model.Library;
import org.Eagle.data.model.User;
import org.Eagle.data.repository.LibraryRepo;
import org.Eagle.data.repository.UserRepo;
import org.Eagle.dtos.CreateLibraryAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.InputMismatchException;

import static org.Eagle.utils.map.map;

@Service

public class LibraryServiceImpl implements LibraryServiceInter {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private ShelfRepo shelfRepo;
    @Autowired
    private LibraryRepo libraryRepo;
    @Override
    public void register(CreateLibraryAccount registerUser) {
        validateUser(registerUser.getUserName());
        Library newLibrary = new Library();
        map(registerUser, newLibrary);
        userRepo.save(newLibrary);
    }

    private void validateUser(String userName) {
        for (User user: userRepo.findAll()) {
            if (user.getUserName().equals(userName)) {
                throw new InputMismatchException("User already exist");
            }
        }
    }

    @Override
    public long count() {
        return libraryRepo.count();

    }
    public String collectBookAndSave(String title, String  content, String author, String creator){
        CreatorServiceImpl creatorService = new CreatorServiceImpl();
        creatorService.createBook(title, content, author, creator);
        shelfRepo.save(creatorService);
    }

    @Override
    public void lockLibrary() {


    }

    @Override
    public void unlockLibrary() {

    }

    @Override
    public void delete(String username, String password) {
        for (Library library: libraryRepo.findAll())
            if (library.getPassword().equals(password)){
                libraryRepo.delete(library);
        }
    }
}
