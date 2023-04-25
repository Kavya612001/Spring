package com.learn.learnspringframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGamingBasicJavaSpringBeans {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GamingConfiguration.class);
        context.getBean(GamingConsole.class).up();

        context.getBean(GameRunner.class).run();

    }
}
