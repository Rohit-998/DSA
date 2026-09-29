public class MaxConsecutiveOnes3 {

    // Brute T=O(N^2) , S=O(1)
    // public int longestOnes(int[] nums, int k) {

    // int maxLength = 0;
    // for (int i = 0; i < nums.length; i++) {
    // int cntZero = 0;
    // for (int j = i; j < nums.length; j++) {
    // if (nums[j]==0) {
    // cntZero++;
    // }
    // if (cntZero<2) {
    // int length = j-i+1;
    // maxLength = Math.max(maxLength, length);

    // }else{
    // break;
    // }
    // }
    // }
    // return maxLength;

    // }

    // Better T=O(2N) , S=O(1)
    // public int longestOnes(int[] nums, int k) {
    // int maxLength = 0;

    // int l = 0;
    // int r = 0;
    // int n = nums.length;
    // int cntZeros = 0;
    // while (r < n) {

    // if (nums[r] == 0) {
    // cntZeros++;
    // }
    // while (cntZeros > k) {
    // if (nums[l] == 0) {
    // cntZeros--;
    // }
    // l++;

    // }
    // int len = r - l + 1;
    // maxLength = Math.max(maxLength, len);
    // r++;
    // }

    // return maxLength;

    // }

    // Optimal T=O(N) , S=O(1)
    public int longestOnes(int[] nums, int k) {
        int maxLength = 0;

        int l = 0;
        int r = 0;
        int n = nums.length;
        int cntZeros = 0;
        while (r < n) {

            if (nums[r] == 0) {
                cntZeros++;
            }
            if (cntZeros > k) {
                if (nums[l] == 0) {
                    cntZeros--;
                }
                l++;

            }

            if (cntZeros <= k) {
                int len = r - l + 1;
                maxLength = Math.max(maxLength, len);
            }
            r++;
        }

        return maxLength;

    }

}
