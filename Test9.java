package array;

public class Test9 {
    public static void main(String[] args) {
        /*给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个整数，并输出它们的数组索引。

提示：先不用考虑效率问题，两层循环即可完成
要求1：只要输出第一对满足要求的情况*/

        //定义数组
        int[] nums = {2,7,11,15};
        //目标和
        int target = 9;

        //i用来拿第一个数字，i是它的下标，从0开始
        for(int i = 0;i<nums.length;i++){
            //j拿第二个数字，必须在i的后面，所以j =i+1
            for(int j = i+1;j<nums.length;j++){
                //判断：两个数字相加，是不是等于目标
                if(nums[i] + nums[j] == target){
                    //满足条件，打印两个下标
                    System.out.println(i+","+j);
                    //找到第一对，直接结束程序，不用再继续找
                    return;
                }
            }
        }


    }
}
