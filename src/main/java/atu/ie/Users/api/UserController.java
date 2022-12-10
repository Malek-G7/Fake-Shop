package atu.ie.Users.api;

import atu.ie.Users.User;
import atu.ie.Users.Service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequestMapping("api/user")
@RestController
public class
UserController {
    private UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @GetMapping
    public List<User> getAllUsers(){
       return userService.getAllUsers();
    }

    @PostMapping(path = "{id}")
    public void addItem(@PathVariable("id") UUID uuid){
        userService.addItemToUserByID(uuid);
    }

    @GetMapping(path = "{id}")
    public Optional<User> getUserByID(@PathVariable("id") UUID uuid){
        return userService.getUserByID(uuid);
    }
    @DeleteMapping(path = "{id}")
    public void deleteUserByID(@PathVariable("id") UUID uuid){
        userService.deleteUserByID(uuid);
    }
}
