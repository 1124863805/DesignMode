package cn.java52.Decorator.example;

//抽象装饰角色
public class Decorator implements Component {
    private Component component;
    public Decorator(Component component)
    {
        this.component=component;
    }
    public void operation()
    {
        component.operation();
    }
}
