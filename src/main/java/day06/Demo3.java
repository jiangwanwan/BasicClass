package day06;

import javax.swing.text.Style;

/**
 * Created by Wanwan on 2017/4/6.
 *
 * 匿名对象： 没有引用类型变量指向的对象
 *
 * 匿名对象要注意的事项：
 *      1.一般不会给匿名对象赋予属性值，因为永远无法获取到它的属性值；
 *      2.两个匿名对象永远都不可能是同一个对象；
 *
 *  匿名对象的应用场景：
 *      1.如果一个对象需要调用一个方法，而调用完这个方法之后，该对象就不再使用了，这时候可以使用匿名对象；（节省内存空间）
 *      2.可以作为实参调用一个函数。
 */


//学生类
class Student{
    int num;
    String name;

    public void study(){
        System.out.println("好好学习，天天向上！！");
    }
}
public class Demo3 {

    public static void main(String[] args) {

        Student stu = new Student();

        new Student();  //匿名对象

        new Student().name = "小花";  //匿名对象赋值

        System.out.println(new Student() == new Student()); //false,表示不是同一个对象

        /**
         * 需求： 调用Student的study方法。
         */
        new Student().study();  //一执行完，就成了垃圾对象，可能被垃圾回收器回收，从而节省内存空间

    }
}
