package com.luv2code.springcoredemo.common;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    public CricketCoach() {
        System.out.println("Cricket Class is called" +getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkOut() {
        return "Practice fast Bowling For 15 mins";
    }
}
