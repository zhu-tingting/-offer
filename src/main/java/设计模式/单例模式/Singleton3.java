package 设计模式.单例模式;

/**
 * 使用内部类
 *
 * Created by zhutingting05 on 2019-07-18.
 */
public class Singleton3 {


    private Singleton3() {

    }

    private static class SingletonHolder {

        private static Singleton3 instance = new Singleton3();

    }

    public static Singleton3 getInstance() {
        return SingletonHolder.instance;
    }
}
