package com.immanuel.mySecondApp;

import org.springframework.stereotype.Component;

// note 4
@Component
public class Laptop {
    public void compile() {
        System.out.println("Compiling with 404 bugs.");
    }
}
