package com.sparshGupta;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

    public static void main(String[] args) {

        //initialize the context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve the bean
        CricketCoach cricketCoach = context.getBean("myCricketCoach", CricketCoach.class);

        //call bean methods
        System.out.println(cricketCoach.getDailyWorkout());

        //close the context
        context.close();

    }

}
