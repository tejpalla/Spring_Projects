package com.in28min.springboot.learn_spring_boot;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.context.annotation.ComponentScan;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

//@RestController
//@ComponentScan

public class CourseConfigurationController {

  //  @Autowired
    private CourseProperties courseProperties;

    //@RequestMapping("/course-properties")
    public CourseProperties retrieveAllCourses(){
        return courseProperties;
    }
}
