package net.javaguides.springboot.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import net.javaguides.springboot.dto.User1Request;
import net.javaguides.springboot.entity.User1;
import net.javaguides.springboot.exception1.UserNotFoundException;
import net.javaguides.springboot.service.UserService1;

@RestController
@RequestMapping("/users")
public class UserController1 {
    private final UserService1 userService1;

    public UserController1(UserService1 userService1) {
        this.userService1 = userService1;
    }

    @PostMapping("/signup")
    public ResponseEntity<User1> saveUser( @RequestBody @Valid User1Request user1Request){
        return new ResponseEntity<>(userService1.saveUser(user1Request), HttpStatus.CREATED);
    }

    @GetMapping("/fetchAll")
    public ResponseEntity<List<User1>> getAllUsers(){
        return ResponseEntity.ok(userService1.getAllUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<User1> getUser(@PathVariable int id) throws UserNotFoundException{
            return ResponseEntity.ok(userService1.getUser1(id));
    
    }
}
