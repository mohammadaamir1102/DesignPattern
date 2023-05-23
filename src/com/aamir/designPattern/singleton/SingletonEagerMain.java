package com.aamir.designPattern.singleton;

public class SingletonEagerMain {

    public static void main(String[] args) {
        System.out.println("first instance "+ SingletonEager.getSingletonEager().hashCode());
        System.out.println("second instance should be same "+ SingletonEager.getSingletonEager().hashCode());
    }
}
