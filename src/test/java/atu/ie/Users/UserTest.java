package atu.ie.Users;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    User user ;

    @Test
    void TestConstructor(){
        user =  new User("testUser","email@","password");
        assertEquals("testUser",user.getName());
        assertEquals("email@",user.getEmail());
        assertEquals("password",user.getPassword());
    }
}
