package cn.java52.Iterator.example;

import java.util.ArrayList;
import java.util.List;

//具体聚合
class ConcreteAggregate implements Aggregate
{
    private List<Object> list=new ArrayList<Object>();
    public void add(Object obj)
    {
        list.add(obj);
    }
    public void remove(Object obj)
    {
        list.remove(obj);
    }
    public Iterator getIterator()
    {
        return(new ConcreteIterator(list));
    }
}