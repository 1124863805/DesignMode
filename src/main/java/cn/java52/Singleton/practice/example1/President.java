package cn.java52.Singleton.practice.example1;

public class President {
    private static volatile President instance = null; // 保证instance在所有线程中同步

    private President(){
        System.out.println("产生一个总统");
    }

    public static synchronized President getInstance(){

        if(instance == null){
            instance = new President();
        }else{
            System.out.println("已经有一个总统，不能产生新总统！");
        }

        return instance;
    }

    public void getName(){
        System.out.println("我是美国总统：特朗普。");
    }


}
