package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.bean.User;
import project.service.UserService;

import java.util.List;

@RestController // 相当于异步请求处理 返回结果一般是json数据
@RequestMapping("/user")
public class UserController {
    @Autowired //代理对象 AOP编程 JDK动态代理
    UserService userService;

    @RequestMapping("/findAll")
    public List<User> findAll(){

        System.out.println("userService.getClass = "+ userService.getClass());

        return userService.findAll();
    }

    @RequestMapping("/findUsers")
    public List<User> findUsers(){
        return userService.findUsers();
    }

    @RequestMapping("/findUserById/{id}")
    public User findUserById(@PathVariable("id") Integer id) {
        return userService.findUserById(id);
    }
    @RequestMapping("/saveUser")
    public void saveUser(User user) {
        userService.saveUser(user);
    }
    @RequestMapping("/updateUser")
    public void updateUser(User user) {
        userService.updateUser(user);
    }
    @RequestMapping("/deleteUserById/{id}")
    public void deleteUserById(@PathVariable("id")  Integer id) {
        userService.deleteUserById(id);
    }
}
