package cn.java52.Builder.example;

public class Client {

    public static void main(String[] args) {
        Builder builder=new ConcreteBuilder();
        Director director=new Director(builder);
        Product product=director.construct();
        product.show();
    }
}
