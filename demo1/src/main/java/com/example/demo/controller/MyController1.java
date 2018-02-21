package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.boot.actuate.metrics.GaugeService;
import org.springframework.boot.actuate.metrics.writer.DefaultCounterService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class MyController1 {




    @Autowired
    private CounterService counterService;


    @Autowired
    private GaugeService gaugeService;



    @RequestMapping("/hello")
    public String Hello() {

        Date now= new Date();

        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        counterService.increment("myCounterService1");
        gaugeService.submit("mygaugeService1",1);

        return  simpleDateFormat.format(now)+" ok ,gaugeService:" + gaugeService+"   CounterService:"+counterService;
    }
}

