package com.aamir.designPattern.abstractFactoryDesign;

public class Manager implements Employee{
    @Override
    public Double salary() {
        return 10000000d;
    }

    @Override
    public String name() {
        System.out.println("it is manager !");
        return "Manager";
    }
}
