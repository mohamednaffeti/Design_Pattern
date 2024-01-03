package org.example;

import org.example.factory.Computer;
import org.example.factory.ComputerFactory;

public class Main {
    public static void main(String[] args) {

        Computer pc = ComputerFactory.getComputer("pc");

        System.out.println(pc);

        Computer introuvable = ComputerFactory.getComputer("introuvable");
        System.out.println(introuvable);
    }
}