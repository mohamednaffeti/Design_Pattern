package org.example.singleton;

public class mainThreadSafe {
    public static void main(String[] args) {
        for (int i=0;i<5;i++){
            ThreadSafeSingleton.getInstance();
        }
    }
}
