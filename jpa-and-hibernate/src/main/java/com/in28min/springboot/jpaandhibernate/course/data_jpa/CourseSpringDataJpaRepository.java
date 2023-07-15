package com.in28min.springboot.jpaandhibernate.course.data_jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28min.springboot.jpaandhibernate.course.jdbc.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
    
    
}
