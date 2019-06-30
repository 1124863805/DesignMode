package cn.java52.Iterator.practice.example1;

//婺源景点类
class WyViewSpot
{
    private String Name;
    private String Introduce;
    WyViewSpot(String Name,String Introduce)
    {
        this.Name=Name;
        this.Introduce=Introduce;
    }
    public String getName()
    {
        return Name;
    }
    public String getIntroduce()
    {
        return Introduce;
    }
}