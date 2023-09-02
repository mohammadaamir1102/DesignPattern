package com.aamir.designPattern.abstractFactoryDesign;

public class AndroidDeveloper implements Employee {
    @Override
    public Double salary() {
        return 10000d;
    }

    @Override
    public String name() {
        System.out.println("Android Developer");
        return "Android Developer";
    }
}
