package com.aamir.designPattern.singleton;

public class SingletonEager {

    private static final SingletonEager singletonEager = new SingletonEager();

    public static SingletonEager getSingletonEager() {
        return singletonEager;
    }
}
