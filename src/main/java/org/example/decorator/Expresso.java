package org.example.decorator;

public class Expresso extends Boisson{
    @Override
    public double cout() {
        return 5.0;
    }
    public Expresso(){
        super.setDescription("Expresso");
    }
}
