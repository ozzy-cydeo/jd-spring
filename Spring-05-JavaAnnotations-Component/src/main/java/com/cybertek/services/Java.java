package com.cybertek.services;

import com.cybertek.com.cybertek.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours: 20");
    }
}
