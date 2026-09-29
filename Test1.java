package method;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
       /*跳水比赛有五个评委打分，分数在0~100之间。最终得分会去掉一个最高分，去掉一个最低分，剩余的分数再求平均数，该平均数为选手最终得分。
要求1：利用键盘录入5个整数存入数组当中，如果分数超出范围需要重新录入
要求2：定义方法分别求数组的最大值和最小值
要求3：计算五名评委的总分
要求4：总分 - 最大值 - 最小值，求选手最终平均分
*/
        //创建键盘对象
        Scanner sc = new Scanner(System.in);
        //定义数组，长度5，存放5个评委分数
        int[] scoreArr = new int[5];

        //循环录入5个分数，非法数字重新输入
        int index = 0;//数组下标，从0开始
        while(index < scoreArr.length){
            System.out.print("请输入第" + (index + 1) + "个评委的分数：");
            int score = sc.nextInt();
            //判断分数范围0~100
            if(score >=0&&score<=100){
                scoreArr[index] = score;
                index++;//合法，下标往后走
            }else{
                System.out.println("分数超出范围，请重新输入");
            }
        }

        //调用方法获取最大值、最小值、总分
        int max = getMax(scoreArr);
        int min = getMin(scoreArr);
        int sum = getSum(scoreArr);

        //去掉最低分，去掉最高分，剩余分数求平均值
        int realTotal = sum - max - min;
        double avg = realTotal / 3.0;

        //打印结果
        System.out.println("最高分：" + max);
        System.out.println("最低分：" + min);
        System.out.println("选手最终得分：" + avg);
    }
    //方法：求数组最大值
    public static int getMax(int[] arr){
        //假设第一个元素是最大值
        int max = arr[0];
        //遍历数组，比较大小
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;//返回最大值
    }
    //方法：求数组最小值
    public static int getMin(int[] arr){
        //假设第一个元素是最小值
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;//返回最小值
    }
    //方法：计算数组总和
    public static int getSum(int[] arr){
        int sum = 0;//累加和初始为0
        for(int num : arr){
            sum += num;
        }
        return sum;//返回总和总分
    }
}
