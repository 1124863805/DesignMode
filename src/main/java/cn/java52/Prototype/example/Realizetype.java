package cn.java52.Prototype.example;

public class Realizetype implements Cloneable {

    Realizetype()
    {
        System.out.println("具体原型创建成功！");
    }

    public Object clone() throws CloneNotSupportedException
    {
        System.out.println("具体原型复制成功！");
        return (Realizetype)super.clone();
    }
}
