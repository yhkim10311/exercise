package com.ex.sample;

import com.ex.test.Creature;
import com.ex.test.Human;

public class OtherPackageClass implements Creature {

    public void test(){
        Creature human = new Human();
        human.test();
        System.out.println("Hello World");
    }
}
