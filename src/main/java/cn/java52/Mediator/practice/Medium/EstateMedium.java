package cn.java52.Mediator.practice.Medium;

import java.util.ArrayList;
import java.util.List;

class EstateMedium implements Medium
{
    private List<Customer> members=new ArrayList<Customer>();
    public void register(Customer member)
    {
        if(!members.contains(member))
        {
            members.add(member);
            member.setMedium(this);
        }
    }
    public void relay(String from,String ad)
    {
        for(Customer ob:members)
        {
            String name=ob.getName();
            if(!name.equals(from))
            {
                ((Customer)ob).receive(from,ad);
            }
        }
    }
}