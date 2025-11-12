package com.immanuel.mySecondApp;

import org.springframework.stereotype.Component;

// Note 03
// telling Spring the class it has to manage
@Component
public class Dev {

    public void build() {
        System.out.println("working on a project");
    }
}
