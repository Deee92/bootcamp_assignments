// JdbcTemplate

package com.spring.data.question11;

import com.spring.data.question10.Question10UserDao2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.Date;

@Repository
public class Question11UserDao1 {
    @Autowired
    DataSource dataSource;
    
    @Autowired
    JdbcTemplate jdbcTemplate;
    
    public void deleteUser(String pattern) {
        String sql = "DELETE FROM user WHERE username LIKE ?";
        String username = "_" + pattern;
        jdbcTemplate.update(sql, new Object[]{username});
    }
    
    // Transaction options
    
    @Transactional(readOnly = true)
    public void txnReadOnly() {
        String sql = "INSERT INTO user (username, password, name, age, dob) VALUES(?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{"1man", "12", "1 Man", 40, new Date()});
    }
    
    @Transactional(timeout = 2)
    public void txnTimeOut() {
        String sql = "INSERT INTO user (username, password, name, age, dob) VALUES(?,?,?,?,?)";
        try {
            Thread.currentThread().sleep(4000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        jdbcTemplate.update(sql, new Object[]{"2man", "12", "2 Man", 40, new Date()});
    }
    
    @Transactional(rollbackFor = ArithmeticException.class)
    public void txnRollbackFor() {
        String sql = "INSERT INTO user (username, password, name, age, dob) VALUES(?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{"3man", "12", "3 Man", 40, new Date()});
        throw new ArithmeticException();
    }
    
    @Transactional(noRollbackFor = ArithmeticException.class)
    public void txnNoRollbackFor() {
        String sql = "INSERT INTO user (username, password, name, age, dob) VALUES(?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{"4man", "12", "4 Man", 40, new Date()});
        throw new ArithmeticException();
    }
}