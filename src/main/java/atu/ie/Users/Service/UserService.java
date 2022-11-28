package atu.ie.Users.Service;

import atu.ie.Users.User;
import atu.ie.Users.dao.UserDAO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserDAO userDAO;

    public UserService(@Qualifier("ArrayList") UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public void addUser(User user){
        userDAO.insertUserToDB(user);
    }
    public List<User> getAllUsers(){
        return userDAO.getAllUsersFromDB();
    }
}
