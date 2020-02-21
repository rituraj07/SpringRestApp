package com.WebApp.Topic.Controller;

import com.WebApp.Topic.Service.TopicService;
import com.WebApp.Topic.pojo.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TopicController {
    @Autowired
    private TopicService topicService;
    @GetMapping("/topics")
    public List<Topic> getTopics(){
       return topicService.getTopic();
    }

    @GetMapping("/topics/{id}")
    public List<Topic> getTopic(@PathVariable String id)
    {
        return topicService.getTopic(id);
    }

    @PostMapping("/topics")
    public void addTopics(@RequestBody Topic topic)
    {
        topicService.addTopic(topic);
    }

    @PutMapping("/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id)
    {
        topicService.updateTopic(topic,id);
    }

    @DeleteMapping("/topics/{id}")
    public void deleteTopic(@PathVariable String id)
    {
        topicService.deleteTopic(id);
    }
}
