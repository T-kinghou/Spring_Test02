package com.hyd.Service.impl;

import com.hyd.Service.UserService;
import com.hyd.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 侯贻达
 * version 1.0
 */
@Service // 相对于是<bean id="" class="">标签,默认id是当前类名首字母小写
public class UserServiceImpl implements UserService {
    //@Autowired  // 默认是按类型注入，相对于是autowire=byType属性
    //但是如果容器中有两个该类型的bean,自动注入就会失败,此时可以`按名字注入`
    @Resource(name="userDaoImpl2") //相对于是autowire=byName属性
    private UserDao userDao;
    public void findUserById() {
        System.out.println("业务层方法被执行>>>");
        userDao.findUserById();
    }
}
