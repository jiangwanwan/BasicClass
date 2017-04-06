package day05;

/**
 * Created by Wanwan on 2017/4/6.
 *
 * 局部变量： 如果一个变量是在一个方法（函数）的内部声明的，那么该变量就是一个局部变量。
 * 成员变量： 成员变量就是定义在方法之外，类之内的变量。
 *
 * 栈内存的特点： 栈内存存储的都是局部变量，变量一旦出了自己的作用域，那么马上会从内存中消失，释放内存空间。
 * 堆内存的特点： 堆内存存储的都是对象数据，对象一旦被使用完，并不会马上从内存中消失，而是等待垃圾回收器不定时把垃圾对象回收，这时候该对象才会消失，释放内存。
 */


public class Demo2 {

    /**
     * 需求： 定义一个函数接受一个int类型的数组对象，找出数组对象中的最大元素返回给调用者；
     */
    public static int getMax(int[] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++){
            for (int j = i+1; j< arr.length; j++){
                if (arr[j] > arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;

                }
            }
        }
    }

    public static void bianli(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,6,3,9,11,63,11};
        System.out.println("数组中最大的元素为;" + getMax(arr));
        sort(arr);
        bianli(arr);
    }
}
