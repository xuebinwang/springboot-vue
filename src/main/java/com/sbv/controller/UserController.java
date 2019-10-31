package com.sbv.controller;

import com.sbv.mapper.UserMapper;
import com.sbv.model.User;
import com.sbv.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wxb
 * @date 2019-10-31 09:49
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/selectUserAll",method = RequestMethod.GET)
    public List<User> selectUserAll(){
        return userService.selectUserAll();
    }
    @RequestMapping(value="/selectUserByUserId",method = RequestMethod.GET)
    public User selectId(String userId){
        User user = userService.selectByPrimaryKey(Integer.parseInt(userId));
        return user;
    }

    @RequestMapping(value="/insertUser",method = RequestMethod.POST)
    public void addUser(User user){
        userService.insert(user);
    }

    @RequestMapping(value="/updateUser",method = RequestMethod.POST)
    public void updateUser(User user){
        userService.updateByPrimaryKeySelective(user);
    }

    @RequestMapping(value="/deleteUser",method = RequestMethod.POST)
    public void deleteId(String userId){
        userService.deleteByPrimaryKey(Integer.parseInt(userId));
    }


}
