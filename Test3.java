package method;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
       /*作业3：计算快递邮费
某快递公司的运费规则如下（首重1kg，超出部分按kg计算，不足1kg按1kg算）：
首重1kg：10元；
超出1-5kg：每kg加2元；
超出5kg以上：每kg加1.5元。
键盘录入小数，表示用户快递的重量，计算最终的结果
要求1：快递重量必须大于0，否则重新输入
要求2：不同价位的计算，单独定义一个方法*/

        Scanner sc = new Scanner(System.in);
        double weight;
        //输入重量，<=0则重新输入
        while(true){
            System.out.print("请输入快递重量(kg)：");
            weight = sc.nextDouble();
            if(weight > 0){
                break;//合法跳出循环
            }else{
                System.out.println("输入的重量有误，请重新输入。");
            }
        }

        //调用计算运费的方法
        double money = calculateCost(weight);
        System.out.println("快递的运费为：" + money + "元");
    }

    //单独定义方法：计算快递邮费
    public static double calculateCost(double w){
        //不足1kg按1kg计算，向上取整
        int kg = (int)Math.ceil(w);
        double price;
        if(kg <= 1){
            //首重1kg：10元
            price = 10;
        }else if(kg <= 5){
            //超出1-5kg：每kg加2元
            price = 10 + (kg - 1) * 2;
        }else{
            //超出5kg以上：每kg加1.5元
            price = 10 + 4 * 2 + (kg - 5) * 1.5;
        }
        return price;
    }
}
