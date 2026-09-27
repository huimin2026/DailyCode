package array;

import java.util.Random;

public class Test7 {
    public static void main(String[] args) {
        /*生成10个0~100的随机数，放到数组里，10个数字不能重复*/

        //1.创建数组，准备存10个不重复数字
        int[] arr = new int[10];
        Random r = new Random();

        //2.生成随机数，存不重复的值
        for(int i = 0;i<arr.length;){
            //这里删掉i++！只有存入成功才i++
            int num = r.nextInt(101);
            //0~100
            //检查：数组里面有没有num
            int count = 0;
            for(int j = 0;j<arr.length; j++){
                if(num == arr[j]){
                    count++;
                    break;
                    //找到重复，停止比对
                }
            }
            //count=0代表没有重复，可以存入
            if(count == 0){
                arr[i] = num;
                i++;
            }
        }
        //3.遍历打印最终数组
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
