package org.example.singleton;

public class mainEagerInitialization {
    public static void main(String[] args) {
        EagerInitializationSingleton instance = EagerInitializationSingleton.getInstance();
        System.out.println(instance);
    }


}
