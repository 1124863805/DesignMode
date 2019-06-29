package cn.java52.Adapter.practice.example;

//电能适配器
public class ElectricAdapter implements Motor {
    private ElectricMotor emotor;
    public ElectricAdapter()
    {
        emotor=new ElectricMotor();
    }
    public void drive()
    {
        emotor.electricDrive();
    }
}
