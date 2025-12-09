package easy;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LC_1_TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15,-2};
        int target = 9;
        Solution obj=new Solution();
        System.out.println(Arrays.toString(obj.twoSum(nums, target)));
    }

    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            int i,j;
            int []ans=new int[2];
            for(i=0;i<nums.length;i++){
                for(j=i+1;j<nums.length;j++){
                    if(nums[i]+nums[j]==target){
                        ans[0]=i;
                        ans[1]=j;
                    }
                }
            }
            return ans;
        }
    }
}