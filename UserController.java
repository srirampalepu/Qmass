package com.example.Registration.controller;



import com.example.Registration.entity.User;
import com.example.Registration.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userservice")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/createuser")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
    @GetMapping("/count")
    public long getCount(User user){
        return userService.getCount(user);
    }
    @GetMapping("/getuser")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

   

    @PutMapping("/updateuser/{id}")
    public User updateUser(@PathVariable String id, @RequestBody User userDetails) {
        return userService.updateUser(id, userDetails);
    }

    @DeleteMapping("/deleteuser/{id}")
    public void deleteUser(@PathVariable String id) {
        userService.deleteUser(id);
    }

    
}
