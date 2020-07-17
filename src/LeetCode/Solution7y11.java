package LeetCode;

import java.util.*;
/*
???????? nums????????????counts??? counts ????? counts[i] ???? nums[i] ?????nums[i] ???????
*/
public class Solution7y11 {
    public List<Integer> countSmaller(int[] nums) {
        ArrayList count = new ArrayList(nums.length);
        int num=0;
        for (int i = 0; i <nums.length ; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if(nums[i]<nums[j]){
                    num++;
                }
            }
            count.add(i,num);
        }
        return count;
    }
}
