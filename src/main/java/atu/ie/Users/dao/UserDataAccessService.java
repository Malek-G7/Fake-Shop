package atu.ie.Users.dao;

import atu.ie.Basket.Basket;
import atu.ie.Item.Item;
import atu.ie.Payment.Payment;
import atu.ie.Users.User;
import atu.ie.Item.Item;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    @Override
    public void deleteUserByID(UUID uuid) {
        Optional<User> user = getUserByID(uuid) ;
        database.remove(user.get());
    }

    @Override
    public Optional<User> getUserByID(UUID uuid){
        return database.stream().filter(user -> user.getId().equals(uuid)).findFirst();
    }

    public void addItemToUserBasketByID(UUID uuid ,Item item){
        User UserInstance = database.stream().filter(u -> u.getId().equals(uuid)).collect(Collectors.toList()).get(0);
        UserInstance.addToBasket(item);

    }
    public void updatePaymentDetailsOfUserByID(UUID uuid, Payment payment){
        User UserInstance = database.stream().filter(u -> u.getId().equals(uuid)).collect(Collectors.toList()).get(0);
        UserInstance.setPayment(payment);
    }

}
