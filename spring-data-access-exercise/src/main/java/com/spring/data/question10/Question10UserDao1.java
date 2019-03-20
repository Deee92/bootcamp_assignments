package com.spring.data.question10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.Date;

@Repository
public class Question10UserDao1 {
    @Autowired
    DataSource dataSource;
    
    @Autowired
    JdbcTemplate jdbcTemplate;
    
    @Autowired
    Question10UserDao2 question10UserDao2;
    
    public void deleteUser(String pattern) {
        String sql = "DELETE FROM user WHERE username LIKE ?";
        String username = "_" + pattern;
        jdbcTemplate.update(sql, new Object[]{username});
    }
    
    // Transaction propagation options
    @Transactional(propagation = Propagation.REQUIRED)
    public void txnInsertUser1() {
        String sql = "INSERT INTO user (username, password, name, age, dob) VALUES(?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{"aman", "012", "A Man", 40, new Date()});
        try {
            question10UserDao2.txnInsertUser1();
        } catch (RuntimeException re) {
            re.printStackTrace();
        }
    }
    
    @Transactional(propagation = Propagation.REQUIRED)
    public void txnInsertUser2() {
        String sql = "INSERT INTO user (username, password, name, age, dob) VALUES(?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{"aman", "012", "a Man", 40, new Date()});
        try {
            question10UserDao2.txnInsertUser2();
        } catch (RuntimeException re) {
            re.printStackTrace();
        }
    }
    
    @Transactional(propagation = Propagation.REQUIRED)
    void txnInsertUser3() {
        String sql = "INSERT INTO user (username, password, name, age, dob) VALUES(?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{"aman", "012", "A Man", 40, new Date()});
        try {
            question10UserDao2.txnInsertUser3();
        } catch (RuntimeException re) {
            re.printStackTrace();
        }
    }
    
    @Transactional(propagation = Propagation.REQUIRED)
    public void txnInsertUser4() {
        String sql = "INSERT INTO user (username, password, name, age, dob) VALUES(?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{"aman", "012", "A Man", 40, new Date()});
        try {
            question10UserDao2.txnInsertUser4();
        } catch (RuntimeException re) {
            re.printStackTrace();
        }
    }
    
    @Transactional(propagation = Propagation.REQUIRED)
    public void txnInsertUser5() {
        String sql = "INSERT INTO user (username, password, name, age, dob) VALUES(?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{"aman", "012", "A Man", 40, new Date()});
        try {
            question10UserDao2.txnInsertUser5();
        } catch (RuntimeException re) {
            re.printStackTrace();
        }
    }
    
    @Transactional(propagation = Propagation.REQUIRED)
    public void txnInsertUser6() {
        String sql = "INSERT INTO user (username, password, name, age, dob) VALUES(?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{"aman", "012", "A Man", 40, new Date()});
        try {
            question10UserDao2.txnInsertUser6();
        } catch (RuntimeException re) {
            re.printStackTrace();
        }
    }
    
    @Transactional(propagation = Propagation.REQUIRED)
    public void txnInsertUser7() {
        String sql = "INSERT INTO user (username, password, name, age, dob) VALUES(?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{"aman", "012", "A Man", 40, new Date()});
        try {
            question10UserDao2.txnInsertUser7();
        } catch (RuntimeException re) {
            re.printStackTrace();
        }
    }
}
