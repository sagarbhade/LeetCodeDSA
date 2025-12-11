package easy;

public class LC_2894_DivAndNDivSumDiff {
    public static void main(String[] args) {
        Solution obj=new Solution();
        System.out.println(obj.differenceOfSum(10,3));
    }
    static class Solution{
        public int differenceOfSum(int n, int m){
            int x = n/m;
            int num2=m*x*(x+1)/2;
            int num1= n*(n+1)/2 - num2;

            return num1-num2;
        }
    }
}

