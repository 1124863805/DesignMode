package cn.java52.Iterator.practice.example1;

//抽象聚合：婺源景点集接口
interface ViewSpotSet
{
    void add(WyViewSpot obj);
    void remove(WyViewSpot obj);
    ViewSpotIterator getIterator();
}