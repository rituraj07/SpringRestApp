package com.WebApp.Course.pojo;

import com.WebApp.Topic.pojo.Topic;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;

@Entity
public class Course {
    @Id
    //@GeneratedValue
    private String Id;
    private String name;
    private String description;
    @ManyToOne(fetch = FetchType.LAZY)
    private Topic topic;

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public Course(){

    }

    public Course(String id, String name, String description,String topicId) {
        Id = id;
        this.name = name;
        this.description = description;
        this.topic = new Topic(topicId,"","");
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
