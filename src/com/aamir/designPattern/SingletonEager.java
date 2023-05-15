package com.aamir.designPattern;

public class SingletonEager {

    private static final SingletonEager singletonEager = new SingletonEager();

    public static SingletonEager getSingletonEager() {
        return singletonEager;
    }
}
