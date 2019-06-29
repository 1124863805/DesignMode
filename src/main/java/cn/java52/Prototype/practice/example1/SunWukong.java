package cn.java52.Prototype.practice.example1;

import javax.swing.*;

public class SunWukong extends JPanel implements Cloneable {

    private static final long serialVersionUID = 5543049531872119328L;

    public SunWukong()
    {
        JLabel l1=new JLabel(new ImageIcon("src/main/resources/Bajie.jpg"));
        this.add(l1);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (SunWukong)super.clone();
    }
}
