package cn.java52.Builder.practice.example1;

public class ConcreteDecorator2 extends Decorator {
    public void buildWall()
    {
        product.setWall("w2");
    }
    public void buildTV()
    {
        product.setTV("TV2");
    }
    public void buildSofa()
    {
        product.setSofa("sf2");
    }
}
