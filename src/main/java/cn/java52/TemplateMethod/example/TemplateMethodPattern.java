package cn.java52.TemplateMethod.example;

public class TemplateMethodPattern {

    public static void main(String[] args)
    {
        AbstractClass tm=new ConcreteClass();
        tm.TemplateMethod();
    }
}
