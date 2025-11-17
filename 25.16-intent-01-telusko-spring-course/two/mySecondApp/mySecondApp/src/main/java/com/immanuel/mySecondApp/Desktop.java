package com.immanuel.mySecondApp;

import org.springframework.stereotype.Component;

// note 9
@Component

public class Desktop implements Computer{
    public void compile() {
        System.out.println("Compiling with 404 bugs but faster");
    }
}
