package net.java.springbootrestfulwebservice.controller;

import lombok.AllArgsConstructor;
import net.java.springbootrestfulwebservice.entity.User;
import net.java.springbootrestfulwebservice.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/user")
public class Controller {

    private UserService userService;

    @PostMapping("/create")
    public ResponseEntity<?> createUser(@RequestBody User user){
        User createdUser = userService.createUser(user);

        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<?> getUser(@PathVariable("id") Long id){
        User getUser = userService.getUser(id);

        return new ResponseEntity<>(getUser, HttpStatus.OK);
    }

    @GetMapping("/get/all")
    public ResponseEntity<?> getAllUser(){
        List<User> allUser = userService.getAllUser();

        return new ResponseEntity<>(allUser, HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<?> updateUser(@PathVariable("id") Long userId,
                                        @RequestBody User user){

        user.setId(userId);
        User updatedUser = userService.updateUser(user);

        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable("id") Long userId){
        userService.deleteUser(userId);


        return new ResponseEntity<>("deleted!",HttpStatus.OK);
    }

}
