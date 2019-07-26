package 设计模式.单例模式;

/**
 * 懒汉模式
 * Created by zhutingting05 on 2019-07-18.
 */
public class Singleton2_1 {
    private static Singleton2_1 instance = null;

    private Singleton2_1() {

    }

    /**
     * 使用双重锁
     *
     * @return
     */
    public static Singleton2_1 getInstance() {
        if (null == instance) {
            synchronized (Singleton2_1.class) {
                if (null == instance) {
                    return instance = new Singleton2_1();
                }
            }
        }
        return instance;
    }

}
