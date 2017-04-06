package day06;

/**
 * Created by Wanwan on 2017/4/6.
 *
 * 封装的步骤：
 *  1. 使用private修饰需要被封装的属性
 *  2. 提供一个公共的方法设置或者获取该私有的属性
 *
 *
 *  疑问：
 */

/**
 * 需求： 使用java类描述百合网的会员
 */
class MyMember{
    String name;
    private String sex; //  私有变量，只能在本类中被访问
    int salary;

    public void talk(){
        System.out.println(name + "聊的很开心！！");
    }

    public void setSex(String s){
        if(s.equals("男")|| s.equals("女")){
            name = s;
        }else {
            System.out.println("输入错误！！");
        }
    }


}

public class Demo4 {

    public static void main(String[] args) {

        MyMember member = new MyMember();
        member.setSex("不男不女");

    }
}
