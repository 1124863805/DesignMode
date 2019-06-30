package cn.java52.TemplateMethod.practice.example2;

public class HookTemplateMethod {

    public static void main(String[] args)
    {
        HookAbstractClass tm=new HookConcreteClass();
        tm.TemplateMethod();
    }
}
