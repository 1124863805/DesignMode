package cn.java52.Decorator.parctice.example;

public class MorriganAensland {

    public static void main(String[] args) {
        Morrigan m0=new original();
        m0.display();
        Morrigan m1=new Succubus(m0);
        m1.display();
        Morrigan m2=new Girl(m0);
        m2.display();
    }
}
