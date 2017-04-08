package day07;

/**
 * Created by Wanwan on 2017/4/7.
 *
 * static(静态修饰符):
 * 1.static修饰成员变量： 如果有数据需要被共享给所有对象使用时，那么就可以使用static使用
 *   静态成员变量的访问方式：1. 可使用对象进行访问 格式：对象.变量名
 *                           2. 可使用类名进行访问 格式：类名.变量名
 *
 * 2.static修饰成员函数：
 * ``静态成员函数的访问方式：1. 可使用对象进行访问 格式：对象.函数名
 *                           2. 可使用类名进行访问 格式：类名.函数名
 *
 *   注意：1. 静态函数是可以通过类名或者对象进行调用的，而非静态函数只能通过对象进行调用
 *
 *         2. 静态函数可以直接访问静态成员，但是不能直接访问非静态成员（成员包括成员变量和成员函数）
 *            why：静态函数是可以使用类名直接调用的，这时候可能还没有存在对象，而非静态的成员数据是随着对象的存在而存在的。
 *
 *         3. 非静态函数可以直接访问静态与非静态成员
 *            why：非静态函数只能由对象调用，当对象存在的时候，静态数据老早就已经存在了，而非静态数据也随着对象的创建而存在了。
 *
 *         4. 静态函数不能出现this或者super关键字
 *            why：静态函数是可以使用类名调用的，一旦使用类名调用这时候不存在的对象，而this关键字是代表了一个函数的调用者对象，这时候产生了冲突。
 *
 *   静态数据的生命周期：静态的成员变量数据是优先于对象存在的。
 */

class Student{
    String name;
    static String country = "中国";   //使用static修饰，就country是共享数据

    public Student(String name){
        this.name = name;
    }

    // 非静态的成员函数
    public void study(){
        System.out.println("好好学习");
    }

    // 静态的成员函数
    public static void sleep(){
        System.out.println("好好睡觉" + country);   //静态函数可以直接访问静态变量
        // System.out.println("好好睡觉" + name);
    }

}
public class Demo4 {
    public static void main(String[] args) {
        Student s1 = new Student("小明");
        Student s2 = new Student("小白");

        System.out.println("姓名：" + s1.name + ",国籍：" + s1.country);
        System.out.println("姓名：" + s2.name + ",国籍：" + s2.country);

        s1.sleep();
        Student.sleep();
    }
}
