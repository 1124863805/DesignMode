package cn.java52.Iterator.example;

//抽象聚合
interface Aggregate
{
    public void add(Object obj);
    public void remove(Object obj);
    public Iterator getIterator();
}