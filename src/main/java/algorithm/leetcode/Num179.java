package algorithm.leetcode;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2021/4/12.2:20 下午
 *
 * @author 刘会贤
 * @Description 类文件说明
 * @Version 1.0
 */
public class Num179 {
    public static void main(String[] args) {
        int[] nums = new int[13];
        nums[0] = 0;
        nums[1] = 1;
        nums[2] = 2;
        nums[3] = 3;
        nums[4] = 34;
        nums[5] = 345;
        nums[6] = 6;
        nums[7] = 7;
        nums[8] = 8;
        nums[9] = 9;
        nums[10] = 10;
        nums[11] = 11;
        nums[12] = 12;
        largestNumber(nums);

    }

    /**
     * nums里面为非负整数
     * @param nums
     * @return
     */
    public static String largestNumber(int[] nums) {
        List<String> list = new ArrayList<>();
        for (int num : nums) {
            list.add(Integer.toString(num));
        }

        list.sort(
                (a, b) -> (b + a).compareTo(a + b));
        if (list.size() > 0 && list.get(0).equals("0")) return "0";

        return String.join("", list);
    }
}
