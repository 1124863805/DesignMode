package cn.java52.Strategy.practice.example1;

import javax.swing.*;

public class BraisedCrabs extends JLabel implements CrabCooking {
    private static final long serialVersionUID=1L;
    public void CookingMethod()
    {
        this.setIcon(new ImageIcon("src/main/resources/strategy//BraisedCrabs.jpg"));
        this.setHorizontalAlignment(CENTER);
    }
}
