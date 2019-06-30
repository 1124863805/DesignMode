package cn.java52.Visitor.example;

//抽象元素类
interface Element
{
    void accept(Visitor visitor);
}