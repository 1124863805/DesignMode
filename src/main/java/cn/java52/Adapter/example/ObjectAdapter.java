package cn.java52.Adapter.example;

public class ObjectAdapter implements Target {

    private Adaptee adaptee;
    public ObjectAdapter(Adaptee adaptee)
    {
        this.adaptee=adaptee;
    }
    public void request() {
        adaptee.specificRequest();
    }
}
