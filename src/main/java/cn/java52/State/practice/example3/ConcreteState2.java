package cn.java52.State.practice.example3;

//具体状态2类
class ConcreteState2 extends ShareState
{
    public void Handle(ShareContext context)
    {
        System.out.println("当前状态是： 状态2");
        context.setState(context.getState("1"));
    }
}
