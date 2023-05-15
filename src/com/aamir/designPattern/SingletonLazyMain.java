package com.aamir.designPattern;

public class SingletonLazyMain {
    public static void main(String[] args) {
        SingletonLazy instance1 = SingletonLazy.getInstance();
        System.out.println("first instance " + instance1.hashCode());
        // getting object once more for identify how many object is created
        SingletonLazy instance2 = SingletonLazy.getInstance();
        System.out.println("second instance " + instance2.hashCode());

        // All above example is belong to lazy way when call the method then get the object otherwise not

    }
}
