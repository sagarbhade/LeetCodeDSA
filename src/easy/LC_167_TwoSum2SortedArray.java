package easy;

import java.util.Arrays;

public class LC_167_TwoSum2SortedArray {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        LC_1_TwoSum.Solution obj=new LC_1_TwoSum.Solution();
        System.out.println(Arrays.toString(obj.twoSum(nums, target)));
    }

    static class Solution {
        public int[] twoSum(int[] arr, int target) {
            int i=0;
            int j = arr.length-1;
            while(i < j){
                if (arr[i] + arr[j] < target) {
                    i++;
                } else if (arr[i] + arr[j] > target) {
                    j--;
                }else{
                    return new int[]{i+1, j+1};
                }
            }
            return null;
        }
    }
}
