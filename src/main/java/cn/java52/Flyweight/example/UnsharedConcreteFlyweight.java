package cn.java52.Flyweight.example;


// 非享元角色
public class UnsharedConcreteFlyweight {

    private String info;
    UnsharedConcreteFlyweight(String info)
    {
        this.info=info;
    }
    public String getInfo()
    {
        return info;
    }
    public void setInfo(String info)
    {
        this.info=info;
    }
}
