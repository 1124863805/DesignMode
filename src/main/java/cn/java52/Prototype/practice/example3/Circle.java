package cn.java52.Prototype.practice.example3;

import java.util.Scanner;

public class Circle implements Shape {


    public Object clone() {
        Circle w=null;
        try
        {
            w=(Circle)super.clone();
        }
        catch(CloneNotSupportedException e)
        {
            System.out.println("拷贝圆失败!");
        }
        return w;
    }


    public void countArea() {
        int r=0;
        System.out.print("这是一个圆，请输入圆的半径：");
        Scanner input=new Scanner(System.in);
        r = input.nextInt();
        System.out.println("该圆的面积="+3.1415*r*r+"\n");
    }

}
