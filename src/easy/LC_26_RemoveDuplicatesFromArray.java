package easy;

import java.util.Arrays;

public class LC_26_RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int []arr = {1, 2,2,3,4,4,5};
        Solution obj=new Solution();
        System.out.println(obj.removeDuplicatesFromArray(arr));
    }
    static class Solution{
        public int removeDuplicatesFromArray(int []nums){
            int unique = 1;
            for(int i=1; i<nums.length;i++){
                if(nums[i] != nums[i-1]){
                    unique+=1;
                    nums[unique -1 ]=nums[i];
                }
            }
            return unique;
        }
    }
}
