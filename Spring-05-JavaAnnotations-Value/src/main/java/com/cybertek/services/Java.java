package com.cybertek.services;

import com.cybertek.com.cybertek.interfaces.Course;
import com.cybertek.com.cybertek.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Java implements Course {

    @Value("JD1")
    private String batch;


    @Value("${instructor}")
    private String instructor;


    @Value("${days}")
    private String[] days;


    @Autowired
    private ExtraSessions extraSessions;


    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours: " + (20 + extraSessions.getHours()));
    }


    @Override
    public String toString() {
        return "Java [batch=" + batch + ", instructor=" + instructor + ", days=" + Arrays.toString(days);
    }

}
