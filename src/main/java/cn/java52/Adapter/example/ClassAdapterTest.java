package cn.java52.Adapter.example;

public class ClassAdapterTest
{

    public static void main(String[] args) {
        System.out.println("类适配器模式测试：");
        Target target = new ClassAdapter();
        target.request();
    }
}
