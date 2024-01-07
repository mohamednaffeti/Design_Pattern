package org.example.decorator;

public class Lait extends BoissonDecorator{


    public Lait(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 3.0 + boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " au lait";
    }
}
