package com.aamir.designPattern.abstractFactoryDesign;

public class JavaDeveloper implements Employee {
    @Override
    public Double salary() {
        return 100000d;
    }

    @Override
    public String name() {
        System.out.println("Java Developer");
        return "I am Java Developer";
    }
}
