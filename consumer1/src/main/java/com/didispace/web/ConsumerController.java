package com.didispace.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.util.Date;

@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "add",method = RequestMethod.GET)
    public String add()
    {
        String result=restTemplate.getForEntity("http://COMPUTESERVICE1/add?a=1&b=2",String.class).getBody();

        return new Date().toString()+" "+ result;
    }
}
