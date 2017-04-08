package day07;

/**
 * Created by Wanwan on 2017/4/7.
 */

/**
 * 需求： 使用java定义一个人类，人具备 id、name、age三个属性，还具备一个比较年龄的方法
 *
 * 要求： 必须要写上构造函数，构造函数也必须要使用this关键字
 */

class Person{
   int id;
   String name;
   int age;

   public Person(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
   }

   public void compare(Person p){
        if(this.age > p.age){
            System.out.println(this.name + "的年龄大");
        }else if (this.age < p.age){
            System.out.println(p.name + "的年龄大");
        }else {
            System.out.println("一样大");
        }
   }
}


public class Demo3 {

    public static void main(String[] args) {

        Person p1 = new Person(1,"小花", 15);
        Person p2 = new Person(2,"小明", 32);

        p1.compare(p2);
    }
}
