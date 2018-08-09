package com.hand.service;

import com.github.pagehelper.PageInfo;
import com.hand.model.User;

public interface UserService {
    int addUser(User user);
    PageInfo<User> findAllUser(int pageNum,int pageSize);

    int deleteUser(Integer userid);

    int updateById(User user);

}
