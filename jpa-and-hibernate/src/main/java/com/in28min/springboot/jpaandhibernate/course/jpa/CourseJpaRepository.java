package com.in28min.springboot.jpaandhibernate.course.jpa;

import org.springframework.stereotype.Repository;

import com.in28min.springboot.jpaandhibernate.course.jdbc.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void insert(Course course){
        entityManager.merge(course);
    }

    public void delete(long id){
        Course course = entityManager.find(Course.class, id);
        entityManager.remove(course);
    }

    public Course findById(long id){
        return entityManager.find(Course.class, id);
    }  
}
