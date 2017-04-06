package day06;

/**
 * Created by Wanwan on 2017/4/6.
 */


/**
 * 需求：使用java描述一个车与修车厂两个事物，车具备的公共属性：轮子数、名字、颜色、还具备跑的功能行为。
 *       跑之前要检测轮子是否少于4个，如果少于4个，那么要送到修车厂修理，修车厂修理之后，车的轮子的数
 *       要补回来4个，然后车就继续跑起来。
 */

class Car{
    int wheel;
    String name;
    String color;

    public void run(){
        if(wheel >= 4){
            System.out.println(name + "车跑起来了！！");
        }else{
            System.out.println(name + "轮子数不够了，需要去修理！！");
        }
    }
}

class CarFactory{

    String name;
    String address;
    String tel;

    public Car repair(Car c){
        if(c.wheel < 4){
            System.out.println("修车");
            c.wheel = 4;
        }
        return c;
    }
}

public class Demo1 {
    public static void main(String[] args) {
        Car car = new Car();
        CarFactory factory = new CarFactory();

        car.name = "宝马";
        car.wheel = 4;

        car.run();
    }
}
