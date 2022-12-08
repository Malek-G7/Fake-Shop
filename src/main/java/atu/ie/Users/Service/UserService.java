package atu.ie.Users.Service;

import atu.ie.Users.User;
import atu.ie.Users.dao.UserDAO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class UserService {
    private final UserDAO userDAO;

    public List<User> getAllUsers(){
        return userDAO.findAll();
    }
    public void addUser(User user){
        userDAO.save(user);
    }
    public User getUserByID(long count) {
        return userDAO.findUserByCount(count);
    }

    public void deleteUserByID(long count){
        userDAO.deleteUserByCount(count);
    }

//    public void addUser(User user){
//        userDAO.insertUserToDB(user);
//    }
//
//    public Optional<User> getUserByID(UUID uuid){
//        return userDAO.getUserByID(uuid);
//    }
//    public void deleteUserByID(UUID uuid){
//       userDAO.deleteUserByID(uuid);
//    }
}
