package com.study.spring.user.repository;

import com.study.spring.user.model.Department;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DepartmentDao {
    DataSource dataSource;

    public DepartmentDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Department selectDepartment(int departmentNo) throws Exception {
        Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM MY_DEPT WHERE DEPT_NO = ?");
        preparedStatement.setInt(1, departmentNo);
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            Department department = new Department();
            department.setDepartmentNo(departmentNo);
            department.setDepartmentName(resultSet.getString(1));
            return department;
        }


        return null;
    }

    public void updateDepartment(Department department) throws Exception {
        Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("UPDATE MY_DEPT SET DEPT_NM = ? WHERE DEPT_NO = ?");
        preparedStatement.setString(1, department.getDepartmentName());
        preparedStatement.setInt(2, department.getDepartmentNo());

        preparedStatement.executeQuery();
    }
}
