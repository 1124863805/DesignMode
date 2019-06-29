package cn.java52.Singleton.practice.example2;

import javax.swing.*;

public class Bajie extends JPanel {
    private static Bajie instance=new Bajie();

    private Bajie()
    {
        JLabel l1=new JLabel(new ImageIcon("src/main/resources/Bajie.jpg"));
        this.add(l1);
    }

    public static Bajie getInstance()
    {
        return instance;
    }
}
