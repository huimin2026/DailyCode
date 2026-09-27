package array;

public class Test10 {
    public static void main(String[] args) {
        /*给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个整数，并输出它们的数组索引。

提示：先不用考虑效率问题，两层循环即可完成
要求2：输出所有满足要求的情况*/

        //数组
        int[] nums = {3,2,4};
        //目标值
        int target = 6;

        //i:取第一个数的下标，一个一个试
        for(int i = 0;i<nums.length;i++){
            //j:取i后面数字的下标，不和前面重复配对
            for(int j= i +1;j<nums.length;j++){
                //两个数字相加对比目标
                if(nums[i] + nums[j] == target){
                    //符合条件，打印下标
                    System.out.println(i+","+j);
                }
            }
        }
    }
}
