package Users;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {

    public List<User> getUsers(){
        List<User> myUser = List.of(
                new User("user1","email@","password"),
                new User("user2","email@","password"),
                new User("user3","email@","password"));
        return myUser;
    }
}
