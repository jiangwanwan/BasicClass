package day08;

/**
 * Created by Wanwan on 2017/4/7.
 * 单例设计模式：保证一个类在内存中只有一个对象
 *
 * 饿汉单例设计模式：
 *  1.私有化构造函数
 *  2.声明本类的引用类型变量，并且使用该变量指向本类对象
 *  3.提供一个公共静态的方法获取本类的对象
 *
 * 懒汉单例设计模式：
 *  1.私有化构造函数
 *  2.声明本类的引用类型变量
 *  3.提供一个公共静态的方法获取本类的对象，获取之前先判断是否已经创建了本类对象
 *
 *  推荐使用饿汉单例设计模式，因为懒汉单例设计模式会存在线程安全问题
 */

class Single2{

    private static Single2 s;

    private Single2(){

    }

    public static Single2 getInstance(){
        if (s == null){
            s = new Single2();
        }
        return s;
    }
}

class Single{

    private static Single single = new Single();

    private Single(){

    }

    public static Single getInstance(){
        return single;
    }
}

public class Demo1 {

    public static void main(String[] args) {

        Single s1 = Single.getInstance();
        Single s2 = Single.getInstance();
        System.out.println(s1 == s2);
    }
}
