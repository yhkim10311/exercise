package com.ex.test;

public class Human implements Creature{

    public boolean isTrue(){ return true;}

    @Override
    public void test(){
        System.out.println("test method overriden1");
    };

    void defaultTest(){}

    protected void protectedTest(){
        System.out.println("hello123");
    }

    private void privateTest(){
        System.out.println("something");
    }

    private void cherryTest(){
        System.out.println("second cherry");
    }

    private void cherry2(){}
}
