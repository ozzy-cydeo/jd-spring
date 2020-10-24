package com.cybertek.services;

import com.cybertek.com.cybertek.interfaces.Course;
import com.cybertek.com.cybertek.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    @Autowired
    private ExtraSessions extraSessions;

    @Override
    public void getTeachingHours() {

        System.out.println("Weekly Teaching Hours: " + (20 + extraSessions.getHours()));
    }
}
