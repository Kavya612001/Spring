package com.learn.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class HelloWorkSpring {

    public static void main(String[] args) {

        // 1. Launch a spring context
        // 2. configure the things that we want spring framework to manage - @Configuration

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address2"));
        // retrieved by class
        System.out.println(context.getBean(Address.class));
        System.out.println(context.getBean(Person.class));
        System.out.println(context.getBean("person2MethodCall"));

        System.out.println(context.getBean("person3Parameters"));

        //Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
