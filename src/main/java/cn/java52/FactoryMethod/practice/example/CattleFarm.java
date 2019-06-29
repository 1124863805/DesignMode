package cn.java52.FactoryMethod.practice.example;

public class CattleFarm implements AnimalFarm {

    public Animal newAnimal() {
        System.out.println("新牛出生");
        return new Cattle();
    }
}
