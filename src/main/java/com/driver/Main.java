package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj=new RWOnly();
        //'name' has private access in 'com.driver.RWOnly'
        //obj.name="testing";

        obj.setName("testing");
       String str =obj.getName() ;
    }
}