package com.ex.sample;

public class SomeClass {
    public static void main(String[] args) {
        String t1 = "36.5";
        String t2 = "37.5";
        Double a = Double.parseDouble(t1);
        if(a.compareTo(37.0)>0){
            System.out.println("first is bigger");
        }else {
            System.out.println("second is bigger");
        }
    }
}
