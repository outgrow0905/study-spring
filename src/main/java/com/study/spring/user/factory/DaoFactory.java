package com.study.spring.user.factory;

import com.study.spring.user.repository.DepartmentDao;
import com.study.spring.user.repository.UserDao;
import com.study.spring.user.service.connection.ConnectionMakerA;

public class DaoFactory {
    public UserDao userDao() {
        return new UserDao(new ConnectionMakerA());
    }

    public DepartmentDao departmentDao() {
        return new DepartmentDao(new ConnectionMakerA());
    }
}
