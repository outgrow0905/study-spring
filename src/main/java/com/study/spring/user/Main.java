package com.study.spring.user;

import com.study.spring.user.factory.DaoFactory;
import com.study.spring.user.repository.DepartmentDao;
import com.study.spring.user.repository.UserDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);

        UserDao userDao = context.getBean("userDao", UserDao.class);
        System.out.println(userDao);

        DepartmentDao departmentDao = context.getBean("departmentDao", DepartmentDao.class);
        System.out.println(departmentDao);
    }
}
