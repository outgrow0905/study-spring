package com.study.spring.user.repository;

import com.study.spring.user.model.User;

import javax.sql.DataSource;
import java.sql.Connection;

public class UserDao {

    DataSource dataSource;

    public UserDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public User selectUser(int userNo) throws Exception {
//        Connection connection = dataSource.getConnection();
//        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM MY_USER WHERE USER_NO = ?");
//        preparedStatement.setInt(1, userNo);
//        ResultSet resultSet = preparedStatement.executeQuery();
//
//        if (resultSet.next()) {
//            User user = new User();
//            user.setUserNo(userNo);
//            user.setUserName(resultSet.getString(1));
//            return user;
//        }

        System.out.println("selectUser()");

        return null;
    }

    public void updateUser(User user) throws Exception {
//        Connection connection = dataSource.getConnection();
//        PreparedStatement preparedStatement = connection.prepareStatement("UPDATE MY_USER SET USER_NM = ? WHERE USER_NO = ?");
//        preparedStatement.setString(1, user.getUserName());
//        preparedStatement.setInt(2, user.getUserNo());
//
//        preparedStatement.executeQuery();

        System.out.println("updateUser()");
    }

}
