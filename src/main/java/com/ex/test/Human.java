package com.ex.test;

public class Human implements Creature{

    public boolean isTrue(){ return true;}

    @Override
    public void test(){
        System.out.println("test method overriden");
    };

    void defaultTest(){}

    protected void protectedTest(){}

    private void privateTest(){}
}
