package cn.java52.ChainOfResponsibility.practice;

//抽象处理者：领导类
abstract class Leader
{
    private Leader next;
    public void setNext(Leader next)
    {
        this.next=next;
    }
    public Leader getNext()
    {
        return next;
    }
    //处理请求的方法
    public abstract void handleRequest(int LeaveDays);
}
