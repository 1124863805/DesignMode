package cn.java52.Iterator.example;

//抽象迭代器
interface Iterator
{
    Object first();
    Object next();
    boolean hasNext();
}