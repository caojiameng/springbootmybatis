package com.hand.controller;

import com.hand.model.User;
import com.hand.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @PostMapping("/add")
    public int addUser(User user){
        return userService.addUser(user);
    }
    @ResponseBody
    @PostMapping("/delete")
    public int deleteUser(Integer userid){
        return userService.deleteUser(userid);
    }
    @ResponseBody
    @PostMapping("/update")
    public int updateUser(User user){
        return userService.updateById(user);
    }

    @ResponseBody
    @PostMapping("/all")
    public Object findAllUser(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1") int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize
    ){
        return userService.findAllUser(pageNum,pageSize);
    }
}
