package com.aamir.designPattern.singleton;

import java.lang.reflect.Constructor;

public class SingletonLazyMain {
    public static void main(String[] args) throws Exception {
        SingletonLazy instance1 = SingletonLazy.getInstance();
        System.out.println("first instance = " + instance1.hashCode());
        // getting object once more for identify how many object is created
        SingletonLazy instance2 = SingletonLazy.getInstance();
        System.out.println("second instance = " + instance2.hashCode());

        // All above example is belong to lazy way when call the method then get the object otherwise not


        /*
         * 1- By reflection API we can break the singleton pattern
         *
         * Question = then what is the solution ?
         * Answer = if object exist then throw the exception inside the constructor.
         * Answer = use enum
         *
         *
         * */
//      below = Reflection API we can break the singleton pattern
        Constructor<SingletonLazy> declaredConstructor = SingletonLazy.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true); // this line read private constructor as public or skipped
        SingletonLazy singletonLazy = declaredConstructor.newInstance();
        System.out.println("break singleton pattern = " + singletonLazy. hashCode());


    }
}
