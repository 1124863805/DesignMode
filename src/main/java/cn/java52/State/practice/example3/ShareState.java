package cn.java52.State.practice.example3;

//抽象状态类
abstract class ShareState {
    public abstract void Handle(ShareContext context);
}
