package cn.java52.Adapter.example;

public class ClassAdapter  extends Adaptee implements Target {
    public void request() {
        specificRequest();
    }
}
