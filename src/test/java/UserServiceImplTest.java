import org.Eagle.data.model.User;
import org.Eagle.dtos.CreateLibraryAccount;
import org.Eagle.services.UserServicesImpl;
import org.Eagle.services.UserServicesInter;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class UserServiceImplTest {
    @Autowired
    private UserServicesInter userServices;

    @Test
    public void testThatUserCanRegister(){
        userServices = new UserServicesImpl();
        CreateLibraryAccount user = new  CreateLibraryAccount();
        user.setUserName("OLa");
        user.setPassword("1");
        String expected = userServices.register(user);
        assertEquals("Account created Successful", expected);


    }


}
