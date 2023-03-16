package com.nikhitha.HelloNameProject.HelloNameProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello/{name}")
    public String getHelloName(@PathVariable String name) {
        return "Hello " + name;
    }
}
