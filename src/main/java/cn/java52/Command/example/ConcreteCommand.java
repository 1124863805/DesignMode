package cn.java52.Command.example;

public class ConcreteCommand implements Command {
    private Receiver receiver;
    ConcreteCommand()
    {
        receiver=new Receiver();
    }
    public void execute()
    {
        receiver.action();
    }
}
