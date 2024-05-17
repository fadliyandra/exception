package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.springboot.entity.User1;

public interface User1Respository extends JpaRepository<User1, Integer>{

    User1 findByUserId(int id);
    
}
