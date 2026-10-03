package test;

import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        /*题目

学校选举学生会主席，有5个候选人。全校1000名同学参与投票（每人一票，可以弃权，或者选1-5号）。投票使用Random模拟。
• 0：弃权
• 1 ~ 5：给对应的候选人投票
要求：
1. 统计每个候选人的得票数和得票率，并找出票最多的候选人。
2. 统计弃权数和弃权率是多少。
利用数组进行统计。*/

        //1.创建一个长度为6的数组，0索引统计弃票的人数 1~5索引统计每个候选人的票数
        int[] arr = new int[6];

        //2.循环1000次，生成投票数据
        //0：弃权
        //1 ~ 5：给对应的候选人投票
        Random r = new Random();
        for (int i = 0;i<1000;i++){
            //生成投票的数据 0~5
            int vote = r.nextInt(0,6);
            //要把投票的数据放入到数组当中
            //vote:含义一：投票的数据
            //     含义二：数组的索引
            arr[vote]++;
        }

        //3.统计每个候选人的得票数和得票率
        for(int i = 1;i<arr.length;i++){
            System.out.println("候选人"+i+"得票数为："+arr[i]+"得票率为："+arr[i]/10.0+"%");
        }

        //4.找出最多的票数（最大值）
        int max = arr[1];
        for(int i = 2;i<arr.length;i++){
            if(max < arr[i]) {
                max = arr[i];
            }
            }
        //5.找出票最多的候选人
        //有可能发生一种情况：多个候选人的票数相同
        for(int i = 1;i < arr.length ; i++){
            if(arr[i] == max)
                System.out.println("票最多的候选人是："+i+"号候选人");
        }
        //6.统计弃票数和弃票率
        System.out.println("弃权数为："+arr[0]+"弃权率为："+arr[0]/10.0+"%");
        }


    }

