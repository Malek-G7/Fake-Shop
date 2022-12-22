package atu.ie.Users.dao;

import atu.ie.Users.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("ArrayList")
public class UserDataAccessService implements UserDAO {
    private static List<User> database = new ArrayList<>();
    @Override
    public void insertUserToDB(User user){
        database.add(new User(user.getName(), user.getEmail(), user.getPassword()));
    }

    @Override
    public List<User> getAllUsersFromDB() {
        return database;
    }
}
//New line