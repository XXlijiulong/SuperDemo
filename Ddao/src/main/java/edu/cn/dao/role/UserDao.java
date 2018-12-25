package edu.cn.dao.role;



import edu.cn.User;

import java.util.Map;

public interface UserDao {
    Map<String,String> checkUser(User user);
}
