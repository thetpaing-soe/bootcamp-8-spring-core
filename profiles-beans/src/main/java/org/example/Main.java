package org.example;

import org.example.service.ReportService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.registerShutdownHook();

//        context.register(AppConfig.class);
//        context.getEnvironment().setActiveProfiles("file");
//        context.refresh();

        int num = Integer.MAX_VALUE;
        String[] sarr = new String[num];

        ReportService reportService = context.getBean(ReportService.class);
        reportService.doAction();
    }
}