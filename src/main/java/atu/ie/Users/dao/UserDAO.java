package atu.ie.Users.dao;

import atu.ie.Users.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Stream;

public interface UserDAO extends JpaRepository <User, Long>
{
    //    List<User> getAllUsersFromDB();
//    void insertUserToDB(User user);
//
//    void deleteUserByID(UUID uuid);
//    Optional<User> getUserByID(UUID uuid);
    public  User findUserByCount(long count);
    public void deleteUserByCount(long count);

}
