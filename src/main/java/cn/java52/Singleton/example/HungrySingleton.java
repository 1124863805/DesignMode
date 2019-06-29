package cn.java52.Singleton.example;

/**
 * 饿汉式单例 (不会存在线程安全)
 *
 * Ensure a class has only one instance, and provide a global point of access to it.
 * （确保某一个类只有一个实例，而且自行实例化并向整个系统提供这个实例。）
 */


/**
 *  ensure a class has only instance .and
 */
public class HungrySingleton {

    private static final HungrySingleton instance=new HungrySingleton();

    private HungrySingleton(){}
    public static HungrySingleton getInstance()
    {
        return instance;
    }
}
