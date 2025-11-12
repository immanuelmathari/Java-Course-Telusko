package com.immanuel.mySecondApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Note 03
// telling Spring the class it has to manage
@Component
public class Dev {

    // note 04b
    @Autowired // this is a field injection
    private Laptop laptop;

    public void build() {
        laptop.compile();
        System.out.println("working on a project");
    }
}
