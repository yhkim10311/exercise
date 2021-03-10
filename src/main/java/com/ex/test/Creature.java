package com.ex.test;

public interface Creature {

    int a=0;
    int ab = 1;

    public default void test(){
        System.out.println("test class is here");
    };

    static void test2() {
        System.out.println("test 2");
    }
}
