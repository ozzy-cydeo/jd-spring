package com.cybertek.services;

import com.cybertek.interfaces.Course;

public class Java implements Course {
    @Override
    public int getTeachingHours() {
        return 10;
    }
}
