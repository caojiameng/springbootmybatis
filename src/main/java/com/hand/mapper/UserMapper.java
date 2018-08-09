package com.hand.mapper;

import com.hand.model.User;
import com.utils.CommonMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper extends CommonMapper<User> {
    public List<User> selectByDeleteId();
    //随便加的俩函数
//    int deleteByPrimaryKey(Integer userid);
//
//    int insert(User record);
//
//    int insertSelective(User record);
//
//    User selectByPrimaryKey(Integer userid);
//
//    int updateByPrimaryKeySelective(User record);
//
//    int updateByPrimaryKey(User record);
//
//    List<User> selectUsers();
}