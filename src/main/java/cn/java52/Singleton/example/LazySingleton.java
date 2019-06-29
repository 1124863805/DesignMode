package cn.java52.Singleton.example;

/**
 *  懒汉式单例
 */
public class LazySingleton {

    private static volatile LazySingleton instance = null; //保证instance 在所有线程中同步

    private LazySingleton(){} // 避免外部实例化

    public static synchronized LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }




}
