package cn.java52.State.practice.example2;

public class ThreadStateTest {

    public static void main(String[] args)
    {
        ThreadContext context=new ThreadContext();
        context.start();
        context.getCPU();
        context.suspend();
        context.resume();
        context.getCPU();
        context.stop();
    }
}
