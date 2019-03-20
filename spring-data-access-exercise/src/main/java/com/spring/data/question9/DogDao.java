package com.spring.data.question9;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class DogDao {
    @Autowired
    SessionFactory sessionFactoryBean;
    
    void getDogCountWithHibernate() {
        System.out.println("=== Count of dogs using Hibernate ===");
        String sql = "SELECT COUNT(*) FROM Dog";
        Query query = sessionFactoryBean.openSession().createQuery(sql);
        System.out.println(query.uniqueResult());
    }
}
