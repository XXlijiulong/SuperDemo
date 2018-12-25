package edu.cn.service.serviceImpl;

import edu.cn.User;
import edu.cn.dao.role.UserMapper;
import edu.cn.service.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private Log log = LogFactory.getLog(UserServiceImpl.class);
    @Autowired
    private UserMapper userMapper;

    @Override
    public User checkUser(User user) {
        log.info("This is the checkUserService！");
        return userMapper.checkUser(user);
    }

}
