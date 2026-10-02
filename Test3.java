package test;

public class Test3 {
    public static void main(String[] args) {
        /*给定两个正序数组 arr1 和 arr2，请先合并数组，并找出合并之后数组的中位数。
举例：
数组 1 2 3 4 5 6 7 8 9，中位数：5
数组 1 2 3 4 5 6，中位数：(3 + 4) / 2*/
        //定义两个已经从小到大排好序的数组
        int[] arr1 = {1,3,5,7};
        int[] arr2 = {2,4,6,8};

        //调用方法合并两个有序数组
        int[] newArr = merge(arr1, arr2);
        //调用方法求中位数
        double median = getMedian(newArr);

        System.out.println("合并后的数组：" + newArr);
        System.out.println("中位数：" + median);
    }

    //方法：合并两个有序数组，返回合并后的有序数组
    public static int[] merge(int[] arr1, int[] arr2){
        //新建数组，长度等于两个数组长度相加
        int[] res = new int[arr1.length + arr2.length];
        //i指向arr1，j指向arr2，k指向新数组
        int i = 0,j = 0,k = 0;

        //两个数组都还有元素没取完时的循环
        while(i < arr1.length && j < arr2.length){
            //谁小把谁放进新数组，然后对应下标+1
            if(arr1[i] < arr2[j]){
                res[k] = arr1[i];
                i++;
            }else{
                res[k] = arr2[j];
                j++;
            }
            k++;
        }
        //arr1还有剩下的元素，直接全部放进新数组
        while(i < arr1.length){
            res[k] = arr1[i];
            i++;
            k++;
        }
        //arr2还有剩下的元素，直接全部放进新数组
        while(j < arr2.length){
            res[k] = arr2[j];
            j++;
            k++;
        }
        return res;
    }

    //方法：传入数组，计算中位数
    public static double getMedian(int[] arr){
        int len = arr.length;
        //数组长度是奇数：中位数就是中间那一个数
        if(len % 2 == 1){
            return arr[len / 2];
        }else{
            //数组长度偶数：中间两个数相加除以2
            return (arr[len / 2 - 1] + arr[len / 2]) / 2.0;
        }
    }
}
