package org.example.singleton;

import com.sun.source.tree.SynchronizedTree;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;
    private ThreadSafeSingleton(){

    }
    public static synchronized ThreadSafeSingleton getInstance(){
        if (instance ==  null){
            System.out.println("Thread safe new Instance");
            return new ThreadSafeSingleton();
        }
        System.out.println("Returning thread Safe Instance");
        return instance;
    }
}
