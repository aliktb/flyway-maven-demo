package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DemoService{

  @Autowired
  private UserRepository userRepository;

  public String helloWorld(){

    log.info("Returning 'Hello World'");
    return "Hello World";
  }

  public Integer createUser(String firstname, String surname){

    log.info("Recieved request to store new user {} {}", firstname,
      surname);

    User newUser = new User(firstname, surname);

    log.info("Saving new user {} {}", newUser.getFirstName(),
      newUser.getSurname());

    User savedUser = userRepository.saveAndFlush(newUser);

    log.info("Saved user with ID {}", savedUser.getId());

    return savedUser.getId();
  }

  public List<User> getAllUsers(){

    log.info("Fetching all users");
    List<User> allUsers = userRepository.findAll();

    log.info("Reuturning all users");
    return allUsers;
  }
}
