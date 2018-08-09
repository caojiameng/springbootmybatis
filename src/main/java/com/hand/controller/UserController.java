package com.hand.controller;

import com.hand.model.User;
import com.hand.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;


    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public int addUser(User user){
        return userService.addUser(user);
    }

    @RequestMapping(value = "/delete/{userid}",method = RequestMethod.DELETE)
    public int deleteUser( @PathVariable Integer userid){
        return userService.deleteUser(userid);
    }
     @PostMapping(value = "/update")
  //  @RequestMapping(value = "/update",method =RequestMethod.PUT)
    public int updateUser( User user){
        return userService.updateById(user);
    }


    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public Object findAllUser(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1") int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize
    ){
        return userService.findAllUser(pageNum,pageSize);
    }
}
