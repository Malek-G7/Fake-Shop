package atu.ie.Users.dao;

import atu.ie.Users.User;

import java.util.List;

public interface UserDAO {
    void insertUserToDB(User user);
    List<User> getAllUsersFromDB();
}
