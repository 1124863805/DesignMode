package cn.java52.Adapter.twoWay;

class TargetRealize implements TwoWayTarget
{
    public void request()
    {
        System.out.println("目标代码被调用！");
    }
}
