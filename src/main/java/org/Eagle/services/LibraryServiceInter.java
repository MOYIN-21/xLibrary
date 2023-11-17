package org.Eagle.services;
import org.Eagle.dtos.CreateLibraryAccount;
import org.springframework.stereotype.Service;

@Service
public interface LibraryServiceInter {
    void register(CreateLibraryAccount registerUser);
    long count();
    void lockLibrary();
    void unlockLibrary();
    void delete(String username, String password);
}
