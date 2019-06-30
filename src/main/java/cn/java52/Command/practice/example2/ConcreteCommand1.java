package cn.java52.Command.practice.example2;

public class ConcreteCommand1 implements AbstractCommand {
    private CompositeReceiver receiver;
    ConcreteCommand1()
    {
        receiver=new CompositeReceiver();
    }
    public void execute()
    {
        receiver.action1();
    }
}
