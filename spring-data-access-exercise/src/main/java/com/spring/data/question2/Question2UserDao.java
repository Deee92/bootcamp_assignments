// DriverManagerDataSource, SingleConnectionDateSource, BasicDataSource

package com.spring.data.question2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class Question2UserDao {
    @Autowired
    DataSource dataSource;
    
    public void getUserName() throws SQLException {
        System.out.println("=== Connecting to MySQL database springDemo using DataSource ===");
        Connection connection = dataSource.getConnection();
        System.out.println("=== Fetching data from table user ===");
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM user");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getString("name"));
        }
    }
}
