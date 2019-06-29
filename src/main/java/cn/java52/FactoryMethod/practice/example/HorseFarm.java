package cn.java52.FactoryMethod.practice.example;

public class HorseFarm implements AnimalFarm{

    public Animal newAnimal() {
        System.out.println("新马出生！");
        return new Horse();
    }
}
