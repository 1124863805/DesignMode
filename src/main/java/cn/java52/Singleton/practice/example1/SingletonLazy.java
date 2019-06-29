package cn.java52.Singleton.practice.example1;

public class SingletonLazy {

    public static void main(String[] args) {
        President  zt1 = President.getInstance();
        zt1.getName(); // 输出总统名字

        President  zt2 = President.getInstance();
        zt1.getName(); // 输出总统名字

        if(zt1 == zt2){
            System.out.println("他们是同一个人！");
        }else{
            System.out.println("他们不是同一个人");
        }
    }
}
