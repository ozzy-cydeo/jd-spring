package com.cybertek.services;

import com.cybertek.com.cybertek.interfaces.Course;
import com.cybertek.com.cybertek.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    private ExtraSessions extraSessions;

    public ExtraSessions getExtraSessions() {
        return extraSessions;
    }

    @Autowired
    public void setExtraSessions(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours: " + (20 + extraSessions.getHours()));
    }
}
