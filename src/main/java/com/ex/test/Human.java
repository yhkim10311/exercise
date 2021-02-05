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

    private void privateTest(){}
}
