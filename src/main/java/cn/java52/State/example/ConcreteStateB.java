package cn.java52.State.example;

//具体状态B类
class ConcreteStateB extends State
{
    public void Handle(Context context)
    {
        System.out.println("当前状态是 B.");
        context.setState(new ConcreteStateA());
    }
}