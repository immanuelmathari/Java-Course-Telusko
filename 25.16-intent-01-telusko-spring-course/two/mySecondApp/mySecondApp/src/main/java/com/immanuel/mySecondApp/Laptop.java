package com.immanuel.mySecondApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// note 4
@Component
// note 10
@Primary
// note 8
public class Laptop implements Computer{
// public class Laptop {
    public void compile() {
        System.out.println("Compiling with 404 bugs.");
    }
}
