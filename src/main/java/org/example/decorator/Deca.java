package org.example.decorator;

public class Deca extends Boisson{

    @Override
    public double cout() {
        return 9.0;
    }
    public Deca(){
        super.setDescription("Deca");
    }
}
