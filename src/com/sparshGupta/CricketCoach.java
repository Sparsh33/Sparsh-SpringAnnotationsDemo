package com.sparshGupta;

import org.springframework.stereotype.Component;


@Component("myCricketCoach")
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Run 10 miles!";
    }
}
