package org.example.proxy;

public class mainproxy  {
    public static void main(String[] args) throws Exception {
        CommandExecutor commandExecutor = new CommandExecuterProxy("mohame","pass");
        commandExecutor.executeCommand("mm file");
    }
}
