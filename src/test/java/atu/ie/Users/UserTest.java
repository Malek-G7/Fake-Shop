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
    @Test
    void TestConstructorFailureName(){
  assertThrows(IllegalArgumentException.class,()-> {User user = new User("m","malek@","123456");});
    }
    @Test
    void TestConstructorFailureEmail(){
        assertThrows(IllegalArgumentException.class,()-> {User user = new User("malek","m","123456");});

    }
    @Test
    void TestConstructorFailurePassword(){
        assertThrows(IllegalArgumentException.class,()-> {User user = new User("malek","malek@","1");});

    }
}
