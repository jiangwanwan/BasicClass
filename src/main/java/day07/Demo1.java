package day07;

/**
 * Created by Wanwan on 2017/4/6.
 *
 *  1. java编译器编译一个java源文件的时候，会把成员变量的声明语句提前至一个类的最前端；
 *  2. 成员变量的初始化工作其实都在构造函数中执行；
 *  3. 一旦经过java编译器编译后，那么构造代码块中的代码就会被移动到构造函数中，且移到构造函数代码之前；构造函数中的代码总是最后执行的
 *  4. 成员变量的显示初始化与构造代码块的代码是按照当前代码的顺序执行的
 */
public class Demo1 {



    //  构造函数
    public Demo1(){
        i = 2;
    }

    //  构造代码块
    {
        i = 3;
    }

    int i = 1;

    public static void main(String[] args) {
        Demo1 d = new Demo1();
        System.out.println("i=" + d.i);
    }
}
