package org.example.proxy;

public class CommandExecutorImplementation implements CommandExecutor{
    @Override
    public void executeCommand(String cmd) throws Exception {
        System.out.println("Command "+ cmd+ "was successfully executed");
    }
}
