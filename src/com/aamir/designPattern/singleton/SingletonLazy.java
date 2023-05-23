package com.aamir.designPattern.singleton;

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
        if(singletonInstance != null){
            // if object already exist then throw the exception
            throw new IllegalStateException("Already Instance created !");
        }
    }

    public static SingletonLazy getInstance() {

        /*
         * This way create the problem while more than one thread is calling this method
         * if considering the thread concept then need to use synchronized block
         * */
//        if (singletonInstance == null) {
//            singletonInstance = new SingletonLazy();
//        }


//         synchronized block
        if (singletonInstance == null) {
            synchronized (SingletonLazy.class) {
                if (singletonInstance == null) {
                    singletonInstance = new SingletonLazy();
                }
            }
        }
        return singletonInstance;
    }
}
