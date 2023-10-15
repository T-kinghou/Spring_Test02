package com.hyd.dao.impl;

import com.hyd.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author 侯贻达
 * version 1.0
 */
@Repository  // 相对于写bean标签,spring就会创建对象
public class  UserDaoImpl implements UserDao {
    public void findUserById() {
        System.out.println("查询数据库>>>>>>");
    }
}
