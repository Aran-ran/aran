package org.fkit.crudrepositorytest.controller;

import org.fkit.crudrepositorytest.bean.User;
import org.fkit.crudrepositorytest.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value ="/user",method = RequestMethod.GET)
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping(value = "/insert",method = RequestMethod.GET)
    public String insert(String loginName,String username,char sex,int age){
        User user1 =new User();
        user1.setLoginName(loginName);
        user1.setUsername(username);
        user1.setSex(sex);
        user1.setAge(age);
        userService.save(user1);
        return "successfully saved!";
    }
    @RequestMapping(value = "/update",method = RequestMethod.GET)
    public String update(int id,String loginName,String username,char sex,int age){
        User user2 = userService.getById(id);
        user2.setLoginName(loginName);
        user2.setUsername(username);
        user2.setSex(sex);
        user2.setAge(age);
        userService.save(user2);
        return "successfully updated!";
    }
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public String delete(int id){
        userService.delete(id);
        return "successfully deleted!";
    }
    @RequestMapping(value = "/select",method = RequestMethod.GET)
    public Iterable<User> select()
    {
        return userService.select();
    }

}