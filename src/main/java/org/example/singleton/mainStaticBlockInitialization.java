package org.example.singleton;

public class mainStaticBlockInitialization {

    public static void main(String[] args) {
        StaticBlockInitialization instance = StaticBlockInitialization.getInstance();
        System.out.println(instance);
    }
}
