package atu.ie.Users.api;

import atu.ie.Users.User;
import atu.ie.Users.Service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequestMapping("api/user")
@RestController
public class UserController {
    private UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }
//    @PostMapping
//    public void addUser(@RequestBody User user){
//        userService.addUser(user);
//    }

    @GetMapping
    public List<User> getAllUsers(){
       return userService.getAllUsers();
    }
    @GetMapping("/{count}")
    public User getUserByID(@PathVariable("count") long count){
        return userService.getUserByID(count);
    }
    @PostMapping("")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }
    // DOESNT WORK ??

//    @DeleteMapping("/{count}")
//    public void deleteUserByID(@PathVariable("count") long count){
//        userService.deleteUserByID(count);
//    }

//    @GetMapping(path = "{id}")
//    public Optional<User> getUserByID(@PathVariable("id") UUID uuid){
//        return userService.getUserByID(uuid);
//    }
//    @DeleteMapping(path = "{id}")
//    public void deleteUserByID(@PathVariable("id") UUID uuid){
//        userService.deleteUserByID(uuid);
   // }
}
