package project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.bean.User;
import project.mapper.UserJpaMapper;
import project.mapper.UserMapper;
import project.service.UserService;

import java.util.List;

@Service

public class UserServiceImp implements UserService {
//    @Resource JDK提供 自动装配 先byName再byType
    @Autowired // 自动装配 先byType 再byName
    UserMapper userMapper;

    @Autowired
    UserJpaMapper userJpaMapper;

    @Transactional(readOnly = true)
    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
    /**
     * 查询所有
     */
    @Override
    public List<User> findUsers() {
        return userMapper.findAll();
    }
    /**
     * 根据id查询
     */
    @Override
    public User findUserById(Integer id) {
        return userJpaMapper.findById(id).get();
    }
    /**
     * 保存
     */
    @Override
    public void saveUser(User user) {
        userJpaMapper.save(user);
    }
    /**
     * 更新
     */
    @Override
    public void updateUser(User user) {
        userJpaMapper.save(user);
    }
    /**
     * 根据id删除
     */
    @Override
    public void deleteUserById(Integer id) {
        userJpaMapper.deleteById(id);
    }
}
