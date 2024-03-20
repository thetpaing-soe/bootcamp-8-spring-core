package org.example;

import org.example.beans.SpringBean1;
import org.example.beans.SpringBean2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.registerShutdownHook();

//        SpringBean2 springBean2 = context.getBean(SpringBean2.class);
//        SpringBean1 springBean1 = context.getBean(SpringBean1.class);
    }
}