package net.javaguides.springboot.service;


import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.springboot.dto.User1Request;
import net.javaguides.springboot.entity.User1;
import net.javaguides.springboot.exception1.UserNotFoundException;
import net.javaguides.springboot.repository.User1Respository;

@Service
public class UserService1 {

    private final User1Respository respository;

    public UserService1(User1Respository respository) {
        this.respository = respository;
    }

    public User1 saveUser (User1Request user1Request){
        User1 user1 = User1.build(0, 
        user1Request.getName(), 
        user1Request.getEmail(),
        user1Request.getMobile(), 
        user1Request.getGender(),
        user1Request.getAge(),
        user1Request.getNationality());
        return respository.save(user1);
    }

    public List<User1> getAllUsers(){
        return respository.findAll();

    }

    public User1 getUser1(int id) throws UserNotFoundException{
       User1 user1 = respository.findByUserId(id);
       if (user1 != null) {
        return user1;
        
       } else {
            throw new UserNotFoundException("user not foud with id : " + id);
       }
    }


}
