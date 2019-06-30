package cn.java52.Decorator.parctice.example;

import javax.swing.*;
import java.awt.*;

//具体构件角色：原身
public class original extends JFrame implements Morrigan
{
    private static final long serialVersionUID = 1L;
    private String t="Morrigan0.jpg";
    public original()
    {
        super("《恶魔战士》中的莫莉卡·安斯兰");
    }
    public void setImage(String t)
    {
        this.t=t;
    }
    public void display()
    {
        this.setLayout(new FlowLayout());
        JLabel l1=new JLabel(new ImageIcon("src/main/resources/decorator/"+t));
        this.add(l1);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
