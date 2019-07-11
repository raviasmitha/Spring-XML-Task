package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Movie movie = (Movie) applicationContext.getBean("movie1");
        System.out.println(movie.getActor());

        Movie movie1 = applicationContext.getBean("movie2",Movie.class);

        System.out.println((movie1.getActor()));

        XmlBeanFactory xmlBeanFactory= new XmlBeanFactory( new ClassPathResource("bean.xml"));
        Movie movieFirst= (Movie)xmlBeanFactory.getBean("movie2");

        movie.setApplicationContext(applicationContext);
        movieFirst.setBeanFactory(xmlBeanFactory);
        movie.setBeanName("beam123");
    }

}