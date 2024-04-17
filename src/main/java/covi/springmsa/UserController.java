package covi.springmsa;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public void createUser(@RequestBody User user) {
        userService.saveUser(user);
    }

    @GetMapping("/{userId}")
    public String getUserById(@PathVariable long userId) {
        return userService.getUserById(userId);
    }

//    @PostMapping
//    public CompletableFuture<User> createUser(@RequestBody User user) {
//        return userService.createUser(user);
//    }

//    @GetMapping("/{userId}")
//    public CompletableFuture<User> getUserById(@PathVariable Long userId) {
//        return userService.getUserById(userId);
//    }
}
