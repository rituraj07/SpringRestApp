package com.WebApp4.Controller;


import com.WebApp.Topic.Controller.TopicController;
import com.WebApp.Topic.Service.TopicService;
import com.WebApp.Topic.pojo.Topic;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RunWith(MockitoJUnitRunner.class)
public class TopicControllerTest {

    @InjectMocks
    private TopicController topicController;

    @Mock
    private TopicService topicService;

//    @GetMapping("/topics/{id}")
//    public List<Topic> getTopic(@PathVariable String id)
//    {
//        return topicService.getTopic(id);
//    }


    @Test
    public void getTopicTest(){
        List<Topic> topics = new ArrayList<>();
        Topic topic = new Topic("one", "one", "one");
        topics.add(topic);

//        Optional<Topic> expectedTopic = Optional.of(new Topic("one", "one", "one"));

        List<Topic> expected = new ArrayList<>();
        Topic expectt = new Topic("one", "one", "one");
        expected.add(expectt);


        Mockito.when(topicService.getTopic("one")).thenReturn(topics);
        Assert.assertEquals(expected.get(0).getId(),topicController.getTopic("one").get(0).getId());
    }
}
