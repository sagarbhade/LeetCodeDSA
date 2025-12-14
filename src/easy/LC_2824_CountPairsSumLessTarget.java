package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_2824_CountPairsSumLessTarget {
        public static void main(String[] args) {
            List<Integer> list=new ArrayList<>(Arrays.asList(-1,1,2,3,1));
            Solution obj= new Solution();
            System.out.println(obj.countPairs(list,2));
        }
        static class Solution{
            public int countPairs(List<Integer> nums, int target) {
                int l=0;
                int res=0;
                int r= nums.size()-1;
                nums.sort((a,b)->a-b);
                while(l != r){
                    if(nums.get(l)+ nums.get(r) < target){
                        res += r-l;
                        l++;
                    }else {
                        r--;
                    }
                }
                return res;
            }
        }
    }

    // 1,2,3,4,5