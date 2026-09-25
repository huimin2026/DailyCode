package array;

public class ArrayDemo1 {
    public static void main(String[] args) {
       /*
        数组的静态初始化：
        1. 定义数组存储3位同学的年龄
        2. 定义数组存储5位同学的身高
        3. 定义数组存储3位同学的名字
                静态初始化语法
        完整格式：
        数据类型[] 数组名 = new 数据类型[]{元素1, 元素2, 元素3, ..., 元素n};

        简写格式：
        数据类型[] 数组名 = {元素1, 元素2, 元素3, ..., 元素n};

        要求写出上面3个数组，分别用完整格式和简写格式写出来。*/

        //1.定义数组存储3位同学的年龄
        int[] ageArr1 = new int[]{18,19,20};
        int[] ageArr2 = {18,19,20};

        //2.定义数组存储5位同学的身高
        double[] heightArr1 = new double[]{1.75,1.76,1.77,1.78,1.79};
        double[] heightArr2 = {1.75,1.76,1.77,1.78,1.79};

        //3.定义数组存储3位同学的名字
        //zhangsan String
        String[] nameArr1 = new String[]{"zhangsan", "lisi", "wangwu"};
        String[] nameArr2 = {"zhangsan", "lisi", "wangwu"};
    }
}
