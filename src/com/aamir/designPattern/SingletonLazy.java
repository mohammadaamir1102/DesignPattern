package com.aamir.designPattern;

public class SingletonLazy {

    /*If we want to create only one object in our project and use again and again
     * it is done by SingletonDesign pattern
     *
     * Example :- If we want to create a connection between application and database only once
     * and use again and again, this is done by Singleton Design pattern
     * */


    /*
     * 1- make constructor as private bcz of it no one create the object from the other classes
     * */

    private static SingletonLazy singletonInstance;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new SingletonLazy();
        }
        return singletonInstance;
    }
}