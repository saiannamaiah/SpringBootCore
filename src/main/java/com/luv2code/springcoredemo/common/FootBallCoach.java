package com.luv2code.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class FootBallCoach implements Coach{
    public FootBallCoach() {
        System.out.println("Football Class is called" +getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkOut() {
        return "Practice Football Drills";
    }
}
