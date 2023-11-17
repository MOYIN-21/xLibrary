package org.Eagle.services;
import org.Eagle.data.model.Library;
import org.Eagle.data.model.Shelf;
import org.Eagle.dtos.RegisterUser;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface libraryServiceInter {
    void register(RegisterUser registerUser);
    long count();
    void lockLibrary();
    void unlockLibrary();
    void delete(String username, String password);
}
