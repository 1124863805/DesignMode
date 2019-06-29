package cn.java52.Adapter.practice.example;

//光能适配器
public class OpticalAdapter  implements Motor {
    private OpticalMotor omotor;
    public OpticalAdapter()
    {
        omotor=new OpticalMotor();
    }
    public void drive()
    {
        omotor.opticalDrive();
    }
}