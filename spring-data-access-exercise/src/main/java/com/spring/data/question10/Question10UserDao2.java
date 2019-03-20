// PROPAGATION.REQUIRED (default)
// PROPAGATION.REQUIRES_NEW
// PROPAGATION.MANDATORY
// PROPAGATION.NEVER
// PROPAGATION.NOT_SUPPORTED
// PROPAGATION.SUPPORTS
// PROPAGATION.NESTED

package com.spring.data.question10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.Date;

@Repository
public class Question10UserDao2 {
    @Autowired
    DataSource dataSource;
    
    @Autowired
    JdbcTemplate jdbcTemplate;
    
    @Transactional(propagation = Propagation.MANDATORY)
    public void txnInsertUser1() {
        String sql = "INSERT INTO user (username, password, name, age, dob) VALUES(?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{"bman", "013", "B Man", 39, new Date()});
        throw new RuntimeException();
    }
    
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void txnInsertUser2() {
        String sql = "INSERT INTO user (username, password, name, age, dob) VALUES(?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{"bman", "013", "b Man", 39, new Date()});
        throw new RuntimeException();
    }
    
    @Transactional(propagation = Propagation.REQUIRED)
    public void txnInsertUser3() {
        String sql = "INSERT INTO user (username, password, name, age, dob) VALUES(?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{"bman", "013", "B Man", 39, new Date()});
        throw new RuntimeException();
    }
    
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void txnInsertUser4() {
        String sql = "INSERT INTO user (username, password, name, age, dob) VALUES(?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{"bman", "013", "B Man", 39, new Date()});
        throw new RuntimeException();
    }
    
    @Transactional(propagation = Propagation.NESTED)
    public void txnInsertUser5() {
        String sql = "INSERT INTO user (username, password, name, age, dob) VALUES(?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{"bman", "013", "B Man", 39, new Date()});
        throw new RuntimeException();
    }
    
    @Transactional(propagation = Propagation.NEVER)
    public void txnInsertUser6() {
        String sql = "INSERT INTO user (username, password, name, age, dob) VALUES(?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{"bman", "013", "B Man", 39, new Date()});
        throw new RuntimeException();
    }
    
    @Transactional(propagation = Propagation.SUPPORTS)
    public void txnInsertUser7() {
        String sql = "INSERT INTO user (username, password, name, age, dob) VALUES(?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{"bman", "013", "B Man", 39, new Date()});
        throw new RuntimeException();
    }
}
