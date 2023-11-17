package org.Eagle.utils;

import org.Eagle.data.model.Library;
import org.Eagle.data.model.User;
import org.Eagle.dtos.CreateLibraryAccount;

public class map {
    public static void map(CreateLibraryAccount registerUser, Library library){
        library.setUserName(registerUser.getUserName());
        library.setPassword(registerUser.getPassword());
    }
    public static void map(CreateLibraryAccount createLibraryAccount, User user){
        user.setUserName(createLibraryAccount.getUserName());
        user.setPassword(createLibraryAccount.getPassword());
    }
}
