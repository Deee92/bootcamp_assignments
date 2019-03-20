package com.spring.data.question3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class Question3UserDao {
    @Autowired
    DataSource dataSource;
    
    @Autowired
    JdbcTemplate jdbcTemplate;
    
    void userCountWithJdbc() {
        String sql = "SELECT COUNT(*) FROM user";
        System.out.println("=== Count of users using JdbcTemplate ===");
        System.out.println(jdbcTemplate.queryForObject(sql, Integer.class));
    }
}