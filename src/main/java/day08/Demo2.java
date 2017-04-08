package day08;

/**
 * Created by Wanwan on 2017/4/8.
 *
 * 继承
 */

class Person{
    String name;


}

class Student extends Person{

    public Student(String name){
        this.name = name;
    }

}

public class Demo2 {

    public static void main(String[] args) {

        Student s = new Student("haha");
        //s.name = "haha";
        System.out.println(s.name);
    }
}
