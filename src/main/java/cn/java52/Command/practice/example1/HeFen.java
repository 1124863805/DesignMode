package cn.java52.Command.practice.example1;

//具体命令：河粉
class HeFen implements Breakfast
{
    private HeFenChef receiver;
    HeFen()
    {
        receiver=new HeFenChef();
    }
    public void cooking()
    {
        receiver.cooking();
    }
}