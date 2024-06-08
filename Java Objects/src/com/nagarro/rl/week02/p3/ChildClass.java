package com.nagarro.rl.week02.p3;

public class ChildClass extends ParentClass {

    {
        System.out.println("Child class instance block");
    }

    static {
        System.out.println("Child class static block");
    }

    static String staticField = "Static field in child class";

    String variable = "Variable in child class";

    public ChildClass() {
        System.out.println("ChildClass constructor");


    }
}
