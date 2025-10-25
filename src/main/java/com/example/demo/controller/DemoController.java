package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DemoService;

@RestController
@RequestMapping("/demo")
public class DemoController{

  @Autowired
  private DemoService demoService;

  @GetMapping("/hello")
  public ResponseEntity<String> HelloWorld(){

    return ResponseEntity.ok(demoService.helloWorld());
  }
}
