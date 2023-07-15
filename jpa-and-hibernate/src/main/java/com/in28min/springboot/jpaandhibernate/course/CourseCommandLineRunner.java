package com.in28min.springboot.jpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28min.springboot.jpaandhibernate.course.data_jpa.CourseSpringDataJpaRepository;
import com.in28min.springboot.jpaandhibernate.course.jdbc.Course;
//import com.in28min.springboot.jpaandhibernate.course.jpa.CourseJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    // @Autowired
    // private CourseJdbcRepository courseJdbcRepository;

    //@Autowired
    //private CourseJpaRepository repository;
    
    @Autowired
    private CourseSpringDataJpaRepository repository;
    @Override
    public void run(String... args) throws Exception {

        // repository.insert(new Course((long) 1, "learnSpring", "tej"));
        // repository.insert(new Course(2, "learnJava", "tej"));
        // repository.insert(new Course((long) 3, "learnPython", "tej"));
        // repository.insert(new Course(4, "learnJavascript", "tej"));

        // repository.findById(1);
        // System.out.println(repository.findById(2));

        repository.save(new Course((long) 1, "learnSpring", "tej"));
        repository.save(new Course(2, "learnJava", "tej"));
        repository.save(new Course((long) 3, "learnPython", "tej"));
        repository.save(new Course(4, "learnJavascript", "tej"));

        repository.findById(1l);
        System.out.println(repository.findById(2l));
    }
    
    
}
