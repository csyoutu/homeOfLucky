package algorithm.leetcode;

/**
 * Created on 2021/3/27.11:16 上午
 *
 * @author 又土
 * @Description 类文件说明
 * @Version 1.0
 */
public class Num35 {
    public static int searchInsert(int[] nums, int target) {
        return search(0,nums.length-1,nums,target);
    }
    public static int search(int left,int right,int []nums,int target){
        int mid=(left+right)/2;
        if(left==right-1){
            if(target<=nums[left]){
                return left;
            }
            if(target==nums[right]){
                return right;
            }
            if(target<nums[right]&&target>nums[left]){
                return left+1;
            }
            if(target>nums[right]){
                return right+1;
            }
        }
        if(nums[mid]==target){
            return mid;
        }
        if(nums[mid]>target){
            return search(left,mid,nums,target);
        }
        return search(mid,right,nums,target);
    }

    public static void main(String[] args) {
        int []nums=new int[]{1,3,5,6};
        int target=7;
        System.out.println(searchInsert(nums,target));
    }
}
