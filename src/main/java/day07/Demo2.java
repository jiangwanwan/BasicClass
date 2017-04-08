package day07;

/**
 * Created by Wanwan on 2017/4/7.
 *
 * 问题： 存在同名的成员变量与局部变量时，在方法的内部访问的是局部变量（java采取的是就近原则的机制访问的）
 *
 *
 *
 * this关键字：代表了所属函数的调用者对象。
 *
 * this关键字作用：
 *  1.如果存在同名成员变量与局部变量时，在方法内部默认是访问局部变量的数据，可以通过this关键字指定访问成员变量的数据。
 *  2.在一个构造函数中可以调用另外一个构造函数初始化对象。
 *
 *  this关键字调用其它构造函数的注意事项：
 *  1. this关键字调用其它的构造函数时，this关键字必须要位于构造函数中的第一个语句
 *  2. this关键字在构造函数中不能出现相互调用的情况，因为是一个死循环
 *
 *this关键字注意事项：
 *  1. 如果存在同名的成员变量与局部变量时，在方法内部默认是访问局部变量的数据，可以通过this关键字指定访问成员变量的数据。
 *  2. 如果在一个方法中访问了一个变量，该变量只存在成员变量的情况下，那么java编译器会在该变量的前面添加this关键字。
 *
 */

class Animal{
    String name = "狗";  // 成员变量
    String color;

    public void eat(){
        String name = "老鼠";     //局部变量
        System.out.println(name + "在吃...");
    }
}
public class Demo2 {

    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
    }
}
