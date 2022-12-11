package atu.ie.Users.dao;


import atu.ie.Item.Item;
import atu.ie.Payment.Payment;
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
    public void addItemToUserBasketByID(UUID uuid , Item item);
    public void updatePaymentDetailsOfUserByID(UUID uuid, Payment payment);

}


