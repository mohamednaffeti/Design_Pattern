package org.example.decorator;

public abstract class Boisson {
    private String description;
    public abstract double cout();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
