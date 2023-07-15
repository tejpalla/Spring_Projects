package com.in28min.springboot.jpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository

public class CourseJdbcRepository {

    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static String INSERT_QUERY = 
            """
                INSERT INTO COURSE(id, name, author)
                values(1, 'learnAWS', 'tej');
            """;
    
    public void insert(){
        springJdbcTemplate.update(INSERT_QUERY);
    }
}
