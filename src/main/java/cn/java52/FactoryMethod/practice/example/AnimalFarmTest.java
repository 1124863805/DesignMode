package cn.java52.FactoryMethod.practice.example;

public class AnimalFarmTest {

    public static void main(String[] args)
    {
        try
        {
            Animal a;
            AnimalFarm af;
            af=(AnimalFarm) ReadXML2.getObject();
            a=af.newAnimal();
            a.show();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
