package com.SpringBootProject1.SpringBoot1.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController11 {
    public static void main(String[] args){}
      @GetMapping("/")

        public String helloworld () {
            return "welcome to code buffer !!!!!!!! aaaa";
        }
    }
