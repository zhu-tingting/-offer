package 设计模式.单例模式;

/**
 * 饿汉模式
 * Created by zhutingting05 on 2019-07-18.
 */
public class Singleton1 {
    private static Singleton1 instance =new Singleton1();

    private Singleton1(){

    }

    public static Singleton1 getInstance(){
        return instance;
    }


}
