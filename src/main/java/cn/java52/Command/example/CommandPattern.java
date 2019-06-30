package cn.java52.Command.example;

public class CommandPattern {

    public static void main(String[] args) {
        Command command = new ConcreteCommand();
        Invoker invoker = new Invoker(command);
        invoker.call();

    }
}
