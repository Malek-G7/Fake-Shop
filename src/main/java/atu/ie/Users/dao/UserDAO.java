package atu.ie.Users.dao;

import atu.ie.Users.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Stream;

public interface UserDAO {
    void insertUserToDB(User user);
    List<User> getAllUsersFromDB();
    void deleteUserByID(UUID uuid);
    Optional<User> getUserByID(UUID uuid);
    public void addItemToUserByID(UUID uuid);

}


