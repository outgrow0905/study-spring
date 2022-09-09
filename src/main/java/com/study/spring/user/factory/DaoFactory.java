package com.study.spring.user.factory;

import com.study.spring.user.repository.DepartmentDao;
import com.study.spring.user.repository.UserDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;

@Configuration
public class DaoFactory {

    @Bean
    public UserDao userDao() {
        return new UserDao(dataSource());
    }

    @Bean
    public DepartmentDao departmentDao() {
        return new DepartmentDao(dataSource());
    }

    @Bean
    public DataSource dataSource() {
        SimpleDriverDataSource simpleDriverDataSource = new SimpleDriverDataSource();
//        simpleDriverDataSource.setDriverClass();
        simpleDriverDataSource.setUrl("");
        simpleDriverDataSource.setUsername("");
        simpleDriverDataSource.setPassword("");
        return simpleDriverDataSource;
    }
}
