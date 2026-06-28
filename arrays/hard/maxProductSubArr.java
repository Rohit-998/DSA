package hard;

public class maxProductSubArr {

    // Brute T=O(N^2) , S=O(1)
    // public int maxProduct(int[] nums) {

    // int max = nums[0];

    // for (int i = 0; i < nums.length; i++) {

    // int product = 1;

    // for (int j = i; j < nums.length; j++) {
    // product *= nums[j];
    // max = Math.max(max, product);

    // }
    // }
    // return max;
    // }
   

    // Brute T=O(N) , S=O(1)
    public int maxProduct(int[] nums) {
       int pre = 1 , suff = 1;
       int ans = Integer.MIN_VALUE;
       int n = nums.length;

       for (int i = 0; i < nums.length; i++) {
        if (pre==0) {
            pre =1;
        }
        if (suff==0) {
            suff =1;
        }
        pre*=nums[i];
        suff*=nums[n-i-1];
        ans = Math.max(ans,Math.max(pre,suff));
       }
       return ans;
    }
}
