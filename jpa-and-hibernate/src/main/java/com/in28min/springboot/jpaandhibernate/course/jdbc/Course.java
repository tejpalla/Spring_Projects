package com.in28min.springboot.jpaandhibernate.course.jdbc;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//@Entity(name = "course-details")
@Entity
public class Course {

    @Id
    private long id;

   // @Column(name = "name") no need because we have same name in the course table
    private String name;

    // @Column(name = "author ") no need because we have same name in the course table 
    private String author;


    public Course(long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
}
