package org.example.ds;

import org.springframework.stereotype.Component;

@Component
public class MyErrorBean {

    public MyErrorBean() {
        System.out.println(this.getClass().getSimpleName() + " created.");
    }
}
