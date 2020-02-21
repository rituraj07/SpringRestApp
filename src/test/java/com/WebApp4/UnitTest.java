package com.WebApp4;

import com.WebApp.Topic.Service.TopicService;
import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.Test;

public class UnitTest {

    @Test
    public void test()
    {
        TopicService service = new TopicService();
        int ans = service.sum(10,2);
        Assert.assertEquals(ans,12);
    }
}
