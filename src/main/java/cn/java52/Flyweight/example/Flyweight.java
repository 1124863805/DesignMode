package cn.java52.Flyweight.example;

//抽象享元角色
interface Flyweight {

    public void operation(UnsharedConcreteFlyweight state);
}
