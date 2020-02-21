package com.WebApp.Topic.pojo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
public interface TopicRepo extends JpaRepository<Topic, String> {

    public Optional<Topic> findById(String id);
}
