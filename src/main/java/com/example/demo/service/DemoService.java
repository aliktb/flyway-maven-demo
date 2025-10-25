package com.example.demo.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DemoService{

  public String helloWorld(){

    log.info("Returning 'Hello World'");
    return "Hello World";
  }
}
