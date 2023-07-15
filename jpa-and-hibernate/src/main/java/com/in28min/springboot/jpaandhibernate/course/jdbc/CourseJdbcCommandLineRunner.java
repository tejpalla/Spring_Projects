package com.in28min.springboot.jpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository courseJdbcRepository;
    
    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
        courseJdbcRepository.insert(
            new Course((long) 1, "Learnspring", "tej")
        );
    }
    
    
}
