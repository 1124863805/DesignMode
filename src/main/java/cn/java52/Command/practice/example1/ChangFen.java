package cn.java52.Command.practice.example1;

public class ChangFen implements Breakfast {
    private ChangFenChef receiver;
    ChangFen()
    {
        receiver=new ChangFenChef();
    }
    public void cooking()
    {
        receiver.cooking();
    }
}
