package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanDefinitionStoreException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Movie movie = (Movie) applicationContext.getBean("movie1");
        System.out.println(movie.getActor());

       Movie movieFirst = applicationContext.getBean("movie2",Movie.class);

        System.out.println(movieFirst.getActor());
        System.out.print("singleton scope: ");

        System.out.println(movie==movieFirst);

        Movie movie1 = applicationContext.getBean("movie3",Movie.class);
        Movie movie2 = applicationContext.getBean("movie3",Movie.class);
        System.out.println(movie1.getActor());
        System.out.println(movie2.getActor());
        System.out.print("scope prototype:");
        System.out.println(movie1==movie2);

        Movie movie3 = applicationContext.getBean("movie4",Movie.class);
        Movie movie4 = applicationContext.getBean("movie4",Movie.class);
        System.out.println(movie3.getActor());
        System.out.println(movie4.getActor());

        System.out.print("default scope:");
        System.out.println(movie3==movie4);
    }

}