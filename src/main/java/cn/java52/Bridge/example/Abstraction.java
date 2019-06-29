package cn.java52.Bridge.example;

abstract class Abstraction {
    protected Implementor imple;
    protected Abstraction(Implementor imple)
    {
        this.imple=imple;
    }
    public abstract void Operation();
}
