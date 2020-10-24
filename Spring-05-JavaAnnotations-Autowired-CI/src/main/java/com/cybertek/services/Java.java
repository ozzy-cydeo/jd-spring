package com.cybertek.services;

import com.cybertek.com.cybertek.interfaces.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    private OfficeHours officeHours;

    @Autowired
    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

    @Override
    public void getTeachingHours() {

        System.out.println("Weekly Teaching Hours: " + (20 + officeHours.getHours()));
    }
}
