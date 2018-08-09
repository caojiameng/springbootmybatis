package com.hand.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hand.mapper.UserMapper;
import com.hand.model.User;
import com.hand.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.soap.SOAPBinding;
import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public int addUser(User user) {

        return userMapper.insert(user);
    }

    @Override
    public PageInfo<User> findAllUser(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<User> users=userMapper.selectAll();
        PageInfo result =new PageInfo(users);
        return result;
    }

    @Override
    public int deleteUser(Integer userid) {
        return userMapper.deleteById(userid);
    }

    @Override
    public int updateById(User user) {
        return userMapper.updateById(user);
    }
}
