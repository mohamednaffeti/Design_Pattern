package org.example.decorator;

public class Cafe extends Boisson{
    @Override
    public double cout() {
        return 7.0;
    }
    public Cafe(){
        super.setDescription("Cafe");
    }
}
