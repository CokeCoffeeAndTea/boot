package project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.bean.User;
import project.mapper.UserMapper;
import project.service.UserService;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserServiceImp implements UserService {
//    @Resource JDK提供 自动装配 先byName再byType
    @Autowired // 自动装配 先byType 再byName
    UserMapper userMapper;

//    @Transactional(readOnly = true)
    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
