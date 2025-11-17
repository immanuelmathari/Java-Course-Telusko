package com.immanuel.mySecondApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// Note 03
// telling Spring the class it has to manage
@Component
public class Dev {

    // note 5
    // private Laptop laptop = new Laptop();
    // note 04b
    @Autowired // this is a field injection
    // private Laptop laptop;
    // note 9b
    // note 11
    @Qualifier("laptop")
    private Computer comp;

    // note 6
    // constructor injections
    // public Dev(Laptop laptop){
    //     this.laptop = laptop;
    // }

    // note 7
    // setter injection
    // @Autowired
    // public void setLaptop(Laptop laptop)
    // {
    //     this.laptop = laptop;
    // }

    public void build() {
        // laptop.compile();
        // note 9b
        comp.compile();
        System.out.println("working on a project");
    }
}
