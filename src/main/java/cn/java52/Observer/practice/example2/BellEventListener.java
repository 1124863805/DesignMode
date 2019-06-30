package cn.java52.Observer.practice.example2;

import java.util.EventListener;

//抽象观察者类：铃声事件监听器
interface  BellEventListener extends EventListener
{
    //事件处理方法，听到铃声
    public void heardBell(RingEvent e);
}