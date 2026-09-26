package array;

public class Test3 {
    public static void main(String[] args) {
       /* 需求：已知数组元素为{33，5，22，44，55}
        请找出数组中最小值并打印在控制台*/

        //1.创建数组
        int[] arr = {33,5,22,44,55};

        //2.定义擂台变量min，默认拿第一个元素
        int min = arr[0];

        //3.循环挨个比较
        for(int i = 0;i<arr.length;i++){
            //如果当前arr[i]比擂台min更小，就替换擂台
            if(min >arr[i]){
                min = arr[i];
            }
        }
        //4.输出结果
        System.out.println(min);
    }
}
