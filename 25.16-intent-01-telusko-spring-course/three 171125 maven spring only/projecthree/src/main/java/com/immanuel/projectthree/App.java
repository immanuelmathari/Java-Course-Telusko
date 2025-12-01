package com.immanuel.projectthree;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // note 3
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        // Dev obj = (Dev) context.getBean(Dev.class); 
        Dev obj = (Dev) context.getBean("dev"); 
        // I want spring to create this object
        // we cant use @component because we dont have spring boot or spring framework. and component is not for spring
        // Dev obj = new Dev(); 
        obj.build();
    }
}
