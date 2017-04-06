package day05;

/**
 * Created by Wanwan on 2017/4/6.
 * 打印出成绩对应的等级
 */
public class Demo1 {
    public static void main(String[] args) {
        String result = getGrade(85);
        System.out.println("对应的等级是:" + result);
    }

    public static String getGrade(int score){
        String grade= "";

        if (score>=90 && score<=100){
            grade = "A等级";
        }else if (score>=80 && score<=89){
            grade = "B等级";
        }else if (score>=70 && score<=79){
            grade = "C等级";
        }else if (score>=60 && score<=69){
            grade = "D等级";
        }else if (score>=0 && score<=59){
            grade = "E等级";
        }else{
            grade = "补考等级";
        }

        return grade;
    }
}
