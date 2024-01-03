package org.example.factory;

public class Pc extends Computer{

    private String Ram;
    private String Hdd;
    private String Cpu;

    public Pc(String ram, String hdd, String cpu) {
        Ram = ram;
        Hdd = hdd;
        Cpu = cpu;
    }

    @Override
    public String getRam() {
        return this.Ram;
    }

    @Override
    public String getHdd() {
        return this.Hdd;
    }

    @Override
    public String getCPU() {
        return this.Cpu;
    }
}
