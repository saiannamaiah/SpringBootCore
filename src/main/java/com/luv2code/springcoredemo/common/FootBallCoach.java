package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class FootBallCoach implements Coach{
    @Override
    public String getDailyWorkOut() {
        return "Practice Football Drills";
    }
}
