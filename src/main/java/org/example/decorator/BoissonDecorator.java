package org.example.decorator;

public abstract class BoissonDecorator extends Boisson {

    protected Boisson boisson;

    public BoissonDecorator(Boisson boisson) {
        super();
        this.boisson = boisson;
    }

    public abstract String getDescription();
}
