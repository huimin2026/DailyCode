package array;

public class Test11 {
    public static void main(String[] args) {
       /*给你两个有序数组 arr1 和 arr2
将两个数组中的数据合并到一个大数组中。
要求：合并之后的大数组也是有序的

举例1：
arr1：1 3 5 7 9
arr2：2 4 6 8 10
arr3：1 2 3 4 5 6 7 8 9 10*/

        //定义两个已经排好从小到大的有序数组
        int[] arr1 ={1,3,5,7,9};
        int[] arr2 ={2,4,6,8,10};

        //创建新数组arr3，长度 = arr1长度 + arr2长度，用来存放合并后的所以数字
        int[] arr3 = new int[arr1.length + arr2.length];

        //i:arr1的下标；j：arr2的下标；k:arr3的下标
        int i = 0;
        int j = 0;
        int k = 0;

        //两个数组都还有数字没取完的时候，循环对比
        while(i<arr1.length&&j<arr2.length){
            //拿arr1当前数字 和 arr2当前数字比较
            if(arr1[i] < arr2[j]){
                //arr1的数字更小，放到新数组
                arr3[k] = arr1[i];
                i++;//arr1取下一个
            }else{
                //arr2的数字更小，放到新数组
                arr3[k] = arr2[j];
                j++;//arr2取下一个
            }
            k++;//新数组往后挪一位，准备存下一个
        }
        //上面循环结束，arr1还有剩下数字，直接全部放进arr3
        while(i<arr1.length){
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        //arr2还有剩下数字，直接全部放进arr3
        while(j < arr2.length){
            arr3[k] = arr2[j];
            j++;
            k++;
        }
        //打印新数组
        for(int m = 0; m < arr3.length; m++){
            System.out.print(arr3[m] + " ");
        }
    }
}
