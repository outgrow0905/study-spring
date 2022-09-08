package com.study.spring.user.service.connection;

import java.sql.Connection;

public interface ConnectionMaker {
    Connection getConnection() throws Exception ;
}
