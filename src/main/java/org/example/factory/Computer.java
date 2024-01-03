package org.example.factory;

public abstract class Computer {

    public abstract String getRam();
    public abstract String getHdd();
    public abstract String getCPU();

    @Override
    public String toString() {
        return "Ma configuration : Ram " + getRam() + "Hdd " + getHdd() + " Cpu "+ getCPU();
    }
}
