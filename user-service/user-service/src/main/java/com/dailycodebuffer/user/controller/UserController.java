package com.dailycodebuffer.user.controller;

import com.dailycodebuffer.user.VO.ResponseTemplateVO;
import com.dailycodebuffer.user.entity.User1;
import com.dailycodebuffer.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@Repository
@RestController
@Slf4j
public class UserController {

    @Autowired
 private UserService userService;
   @PostMapping("/users")
    public User1 saveUser(@RequestBody User1 user){
    log.info("Inside saveUser od UserController");
     return userService.saveUser(user);
 }
 @GetMapping("/{id}")
 public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId){
       log.info("Inside getUserWithDepartment od UserController");
       return userService.getUserWithDepartment(userId);
 }

}
