package org.example.decorator;

public class Chocolat extends BoissonDecorator{

    public Chocolat(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 2.5 + boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " au chocolat";
    }
}
