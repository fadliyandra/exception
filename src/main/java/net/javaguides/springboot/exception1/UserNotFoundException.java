package net.javaguides.springboot.exception1;

public class UserNotFoundException extends Exception{
    
    public UserNotFoundException(String message){
        super(message);
    }
}
