package cn.java52.Iterator.practice.example1;

import java.util.ArrayList;

//具体聚合：婺源景点集
class WyViewSpotSet implements ViewSpotSet
{
    private ArrayList<WyViewSpot> list=new ArrayList<WyViewSpot>();
    public void add(WyViewSpot obj)
    {
        list.add(obj);
    }
    public void remove(WyViewSpot obj)
    {
        list.remove(obj);
    }

    public ViewSpotIterator getIterator()
    {
        return(new WyViewSpotIterator(list));
    }
}