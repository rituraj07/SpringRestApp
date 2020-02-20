package com.WebApp.Topic.Service;

import com.WebApp.Topic.pojo.Topic;
import com.WebApp.Topic.pojo.TopicRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    private TopicRepo topicRepo;

    private List<Topic> topics= new ArrayList<>( Arrays.asList(
            new Topic("one","one","one"),
                new Topic("tow","tow","tow")
        ));
    public List<Topic> getTopic()
    {
        List<Topic> topics =new ArrayList<>();
        topicRepo.findAll().forEach(topics::add);
        return topics;
    }

    public Optional<Topic> getTopic(String id)
    {
       return topicRepo.findById(id);
       //return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic)
    {
        topicRepo.save(topic);
    }

    public void updateTopic(Topic topic, String id)
    {
       /* Topic foundTopic = topics.stream()
                .filter(t->t.getId().equals(id))
                .findFirst().get();

        foundTopic.setDescription(topic.getDescription());
        foundTopic.setName(topic.getName() );


       for (int i=0;i<topics.size();i++)
       {
           Topic t= topics.get(i);
           if(t.getId().equals(id))
           {
               topics.set(i,topic);
               return;
           }
       }
        */
        topicRepo.save(topic);
    }

    public void deleteTopic(String id) {
        /*Topic foundTopic = topics.stream()
                .filter(t->t.getId().equals(id))
                .findFirst().get();
        topics.remove(foundTopic);*/
        topicRepo.deleteById(id);
    }
}
