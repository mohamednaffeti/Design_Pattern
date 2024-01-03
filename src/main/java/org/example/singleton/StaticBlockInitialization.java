package org.example.singleton;

import java.util.concurrent.ExecutionException;

public class StaticBlockInitialization {
    private static StaticBlockInitialization instance;

    public StaticBlockInitialization() {
    }
    static {
        try{
            instance = new StaticBlockInitialization();
        }catch (Exception e){
            e.getStackTrace();
        }
    }
    public static synchronized StaticBlockInitialization getInstance(){
        return instance;
    }
}
