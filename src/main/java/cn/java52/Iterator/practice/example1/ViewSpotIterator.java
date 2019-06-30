package cn.java52.Iterator.practice.example1;

//抽象迭代器：婺源景点迭代器接口
interface ViewSpotIterator
{
    boolean hasNext();
    WyViewSpot first();
    WyViewSpot next();
    WyViewSpot previous();
    WyViewSpot last();
}