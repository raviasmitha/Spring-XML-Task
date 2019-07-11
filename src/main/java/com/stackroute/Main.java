package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Movie movie = (Movie) applicationContext.getBean("movie1");
        System.out.println(movie.getActor());

      Movie movieFirst = applicationContext.getBean("movie2",Movie.class);

      System.out.println((movieFirst.getActor()));

    }

}