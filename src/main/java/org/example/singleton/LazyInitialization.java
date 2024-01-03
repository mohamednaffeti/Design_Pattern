package org.example.singleton;

public class LazyInitialization {
    private static LazyInitialization instance;

    private LazyInitialization() {
    }

    public static LazyInitialization getInstance(){
        if (instance == null){
            System.out.println("creating");
            return new LazyInitialization();
        }
        System.out.println("using");
        return instance;

    }
}
