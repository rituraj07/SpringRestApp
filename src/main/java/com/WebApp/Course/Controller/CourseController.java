package com.WebApp.Course.Controller;

import com.WebApp.Course.Service.CourseService;
import com.WebApp.Course.pojo.Course;
import com.WebApp.Topic.pojo.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/topics/{id}/courses")
    public List<Course> getAllCourse(@PathVariable String id)
    {
       return courseService.getAllCourse(id);
    }

    @GetMapping("/topics/{topicId}/courses/{id}")
    public Optional<Course> getCourse(@PathVariable String id)
    {
        return courseService.getCourse(id);
    }

    @PostMapping("/topics/{topicId}/courses")
    public void addCourse(@PathVariable String topicId,@RequestBody Course course)
    {
        course.setTopic(new Topic(topicId,"",""));
        courseService.addCourse(course);
    }

    @PutMapping("/topics/{topicId}/course/{courseId}")
    public void updateCourse(@RequestBody Course course,@PathVariable String courseId, @PathVariable String topicId)
    {
        course.setTopic(new Topic(topicId,"",""));
        courseService.updateCourse(course);
    }

    @DeleteMapping("/topics/{topicId}/course/{id}")
    public void deleteCourse(@PathVariable String id)
    {
        courseService.deleteCourse(id);
    }
}
