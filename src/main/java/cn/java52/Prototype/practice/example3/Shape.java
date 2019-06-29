package cn.java52.Prototype.practice.example3;

public interface Shape extends Cloneable {
    public Object clone();    //拷贝
    public void countArea();    //计算面积
}
