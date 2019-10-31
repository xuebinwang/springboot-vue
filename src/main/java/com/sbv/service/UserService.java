package com.sbv.service;

import com.sbv.model.User;

import java.util.List;

/**
 * @author wxb
 * @date 2019-10-31 14:59
 */
public interface UserService {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    List<User> selectUserAll();
}
