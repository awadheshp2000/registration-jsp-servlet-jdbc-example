package com.example.registrationjspservletjdbcexample.registration.dao;

import com.example.registrationjspservletjdbcexample.registration.model.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDAO {

    public Integer registerEmployee(Employee employee) throws ClassNotFoundException {

        String INSERT_USERS_SQL = " INSERT INTO EMPLOYEES " +
                " (id, first_name, last_name, username, password, address, " +
                "contact) VALUES " +
                " (?,?,?,?,?,?,?); ";
        int result = 0;

        Class.forName("com.mysql.jdbc.Driver");
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql_database?useSSL=false","root","awadhesh4321");
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)){
        preparedStatement.setInt(1,1);
        preparedStatement.setString(2, employee.getFirstName());
        preparedStatement.setString(3,employee.getLastName());
        preparedStatement.setString(4, employee.getUserName());
        preparedStatement.setString(5, employee.getPassword());
        preparedStatement.setString(6, employee.getAddress());
        preparedStatement.setString(7, employee.getContact());

        System.out.println(preparedStatement);
        result = preparedStatement.executeUpdate();

        } catch (SQLException e){
            e.printStackTrace();
        }
        return result;

    }
}
