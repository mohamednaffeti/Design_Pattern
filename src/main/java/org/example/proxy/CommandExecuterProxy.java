package org.example.proxy;

public class CommandExecuterProxy implements CommandExecutor{
    private boolean isAdmin = false;
    private CommandExecutor commandExecutor;
    public CommandExecuterProxy(String login,String password){
        isAdmin=login.equals("mohamed") && password.equals("pass");
        commandExecutor = new CommandExecutorImplementation();
    }
    @Override
    public void executeCommand(String cmd) throws Exception {
        if (isAdmin){
            commandExecutor.executeCommand(cmd);
        }else{
            if(cmd.contains("rm")){
                throw new Exception("you don't have access");
            }else{
                commandExecutor.executeCommand(cmd);
            }
        }
    }
}
