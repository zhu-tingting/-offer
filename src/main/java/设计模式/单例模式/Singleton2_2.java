package 设计模式.单例模式;

/**
 * 懒汉模式
 * 保证有序性，线程安全
 * Created by zhutingting05 on 2019-07-18.
 */
public class Singleton2_2 {

    private static Singleton2_2 instance = null;

    private Singleton2_2() {

    }

    public static Singleton2_2 getInstance() {
        if (null == instance) {
            synchronized (Singleton2_2.class) {
                Singleton2_2 temp = instance;
                if (null == temp) {
                    synchronized (Singleton2_2.class) {
                        temp = new Singleton2_2();
                    }
                    instance = temp;
                }
            }
        }
        return instance;
    }
}
