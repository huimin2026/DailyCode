package method;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        /*作业2：计算班级分数
班主任需要统计10名学生的数学成绩（0-100分），计算及格率，平均分，并找出最高分。
要求1：键盘录入10名学生的成绩，存入数组。超出范围，提示“成绩无效，请重新输入”。
要求2：定义方法，求及格人数，根据及格人数，求及格率。
要求3：定义方法求总分，根据总分求平均分
要求4：定义方法求最大值。*/

        Scanner sc = new Scanner(System.in);
        //创建数组，存10个学生成绩
        int[] scoreArr = new int[10];
        int index = 0;

        //录入10个成绩，非法就重输
        while(index<scoreArr.length){
            System.out.println("请输入第" + (index + 1) + "个学生的成绩：");
            int score = sc.nextInt();
            if(score >= 0&&score<=100){
                scoreArr[index] = score;
                index++;
            }else{
                System.out.println("成绩无效，请重新输入");
            }
        }

        //调用各个方法
        int passCount = getPassCount(scoreArr);//及格人数
        int sum = getSum(scoreArr);//总分
        int max = getMax(scoreArr);//最高分

        double passRate = passCount / 10.0;//及格率
        double avg = sum / 10.0;//平均分

        System.out.println("及格人数：" + passCount);
        System.out.println("及格率：" + passRate);
        System.out.println("总分：" + sum);
        System.out.println("平均分：" + avg);
        System.out.println("最高分：" + max);
    }
    //方法：求及格人数（>=60算及格）
    public static int getPassCount(int[] arr){
        int count = 0;
        for(int num : arr){
            if(num >= 60){
                count++;
            }
        }
        return count;
    }
    //方法：求总分
    public static int getSum(int[] arr){
        int sum = 0;
        for(int num : arr){
            sum += num;
        }
        return sum;
    }
    //方法：求最大值
    public static int getMax(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
