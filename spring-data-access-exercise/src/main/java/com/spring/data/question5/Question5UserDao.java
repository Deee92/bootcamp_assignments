package com.spring.data.question5;

import com.spring.data.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class Question5UserDao {
    @Autowired
    DataSource dataSource;
    
    @Autowired
    JdbcTemplate jdbcTemplate;
    
    void userCountWithJdbc() {
        String sql = "SELECT COUNT(*) FROM user";
        System.out.println("=== Count of users using JdbcTemplate ===");
        System.out.println(jdbcTemplate.queryForObject(sql, Integer.class));
    }
    
    void insertUserWithJdbc(User user) {
        System.out.println("=== Inserting new user record ===");
        String sql = "INSERT INTO user (username,password,name,age,dob)VALUES(?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{
                user.getUserName(), user.getPassword(), user.getName(), user.getAge(), user.getDateOfBirth()
        });
        System.out.println("Updated user count: ");
        userCountWithJdbc();
    }
}