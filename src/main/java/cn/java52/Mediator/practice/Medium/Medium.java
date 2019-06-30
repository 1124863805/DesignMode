package cn.java52.Mediator.practice.Medium;

//抽象中介者：中介公司
interface Medium
{
    void register(Customer member); //客户注册
    void relay(String from,String ad); //转发
}