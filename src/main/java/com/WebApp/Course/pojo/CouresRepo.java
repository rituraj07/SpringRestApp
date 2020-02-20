package com.WebApp.Course.pojo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CouresRepo extends JpaRepository<Course,String> {

    public List<Course> findByTopicId(String topicId);

}
