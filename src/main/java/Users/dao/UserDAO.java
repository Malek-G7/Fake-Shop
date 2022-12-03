package Users.dao;

import Users.User;

import java.util.List;

public interface UserDAO {
    void insertUserToDB(User user);
    List<User> getAllUsersFromDB();
}
