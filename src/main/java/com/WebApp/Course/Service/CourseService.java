package com.WebApp.Course.Service;

import com.WebApp.Course.pojo.Course;
import com.WebApp.Course.pojo.CouresRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CouresRepo couresRepo;

    public List<Course> getAllCourse(String id)
    {
        List<Course> courses =new ArrayList<>();
        couresRepo.findByTopicId(id).forEach(courses::add);
        return courses;
    }

    public Optional<Course> getCourse(String id)
    {
       return couresRepo.findById(id);
    }

    public void addCourse(Course course)
    {
        couresRepo.save(course);
    }

    public void updateCourse(Course course)
    {

        couresRepo.save(course);
    }

    public void deleteCourse(String id) {
        /*Topic foundTopic = topics.stream()
                .filter(t->t.getId().equals(id))
                .findFirst().get();
        topics.remove(foundTopic);*/
        couresRepo.deleteById(id);
    }
}
