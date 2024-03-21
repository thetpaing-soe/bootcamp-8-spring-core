package org.example.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean1 {

    @Value("#{'${app.name}'.toUpperCase()}")
    private String appName;

    @Value("${app.tax}")
    private int tax;

    @Value("${JAVA_HOME}")
    private String javaHome;

    @Value("${user.name}")
    private String userName;

    @Value("${vm.app.name}")
    private String vmValue;

    @Value("#{'dreamLand'.toUpperCase()}")
    private String streetName;

    @Value("#{2 * 5}")
    private int price;

    @Value("#{springBean2.name}")
    private String name;

    public void print() {
        System.out.println("AppName: " + appName);
        System.out.println("Tax: " + tax);
        System.out.println("JavaHome: " + javaHome);
        System.out.println("Username: " + userName);
        System.out.println("VM properties: " + vmValue);
        System.out.println("Street Name: " + streetName);
        System.out.println("Price: " + price);
        System.out.println("Name: " + name);
    }
}
