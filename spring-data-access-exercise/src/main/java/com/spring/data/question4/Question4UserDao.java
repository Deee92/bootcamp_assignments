package com.spring.data.question4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class Question4UserDao {
    @Autowired
    DataSource dataSource;
    
    @Autowired
    JdbcTemplate jdbcTemplate;
    
    String getUserNameWithJdbc() {
        String sql = "SELECT NAME FROM user WHERE username = ?";
        System.out.println("=== Parameterized query using JdbcTemplate ===");
        return jdbcTemplate.queryForObject(sql, new Object[]{"johndoe"}, String.class);
    }
}