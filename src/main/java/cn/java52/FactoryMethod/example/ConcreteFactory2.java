package cn.java52.FactoryMethod.example;


//具体工厂2：实现了厂品的生成方法
public class ConcreteFactory2 implements AbstractFactory {
    public Product newProduct()
    {
        System.out.println("具体工厂2生成-->具体产品1...");
        return new ConcreteProduct1();
    }
}
