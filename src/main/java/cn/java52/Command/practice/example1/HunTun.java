package cn.java52.Command.practice.example1;

//具体命令：馄饨
class HunTun implements Breakfast
{
    private HunTunChef receiver;
    HunTun()
    {
        receiver=new HunTunChef();
    }
    public void cooking()
    {
        receiver.cooking();
    }
}