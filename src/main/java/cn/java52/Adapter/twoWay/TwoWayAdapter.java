package cn.java52.Adapter.twoWay;

//双向适配器
public class TwoWayAdapter implements TwoWayTarget,TwoWayAdaptee {
    private TwoWayTarget target;
    private TwoWayAdaptee adaptee;
    public TwoWayAdapter(TwoWayTarget target)
    {
        this.target=target;
    }
    public TwoWayAdapter(TwoWayAdaptee adaptee)
    {
        this.adaptee=adaptee;
    }
    public void request()
    {
        adaptee.specificRequest();
    }
    public void specificRequest()
    {
        target.request();
    }
}
