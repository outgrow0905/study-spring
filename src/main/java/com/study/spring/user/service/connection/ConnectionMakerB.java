package com.study.spring.user.service.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionMakerB implements ConnectionMaker{
    @Override
    public Connection getConnection() throws Exception {
        return DriverManager.getConnection("");
    }
}
