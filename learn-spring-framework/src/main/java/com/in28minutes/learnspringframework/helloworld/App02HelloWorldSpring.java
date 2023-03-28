package com.in28minutes.learnspringframework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;


public class App02HelloWorldSpring {
    public static void main(String[] args) {
        //1: launch a spring context
        try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){
            //2: configure the things that we want spring to manage
            //HelloWorldConfiguration - @Configuration
            //in Configuration file we have created the method name and given the @bean annotation

            //3: Retrieving the beans managed by spring
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("person2MethodCall"));
            System.out.println(context.getBean("person3Parameters"));
            System.out.println(context.getBean("person5Qualifier"));
            System.out.println(context.getBean("address2"));
            System.out.println(context.getBean(Address.class));

            //list all the spring beans
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);
        }
    }
}
