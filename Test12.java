package array;

public class Test12 {
    public static void main(String[] args) {
        /*给定一个递增的有序数组和一个目标值，在数组中找到目标值，打印其索引。
如果目标值不存在于数组中，打印应插入的位置

举例1：
数据：nums = [1,3,5,6]; target = 5
输出：2

举例2：
数据：nums = [1,3,5,6], target = 2
输出：1

举例3：
数据：nums = [1,3,5,6], target = 7
输出：4*/

        int[] nums = {1,3,5,6};
        int target = 2;

        //遍历数组，一个一个对比
        for(int i = 0;i<nums.length;i++){
            //如果找到了目标数字
            if(nums[i] == target){
                System.out.println(i);
                return;//找到了就返回，不再继续执行
            }
            //当前数字大于目标，目标就插在i这个位置
            if(nums[i] > target){
                System.out.println(i);
                return;
            }
        }
        //全部数字都比target小，插在数组末尾，位置就是数组长度
        System.out.println(nums.length);
    }
}
