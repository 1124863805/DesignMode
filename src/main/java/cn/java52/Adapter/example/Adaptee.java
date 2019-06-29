package cn.java52.Adapter.example;

//适配器接口
class Adaptee {
    public void specificRequest()
    {
        System.out.println("适配者中的业务代码被调用！");
    }
}
