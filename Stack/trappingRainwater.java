package Stack;

public class trappingRainwater {

    // Brute T=O(2N) , S=O(2N)
    // public int trap(int[] arr) {

    // if (arr == null || arr.length <= 1) {
    // return 0;
    // }

    // int n = arr.length;
    // int[] prefixMax = new int[n];
    // int[] suffixMax = new int[n];
    // prefixMax[0] = arr[0];
    // int j = n - 2;
    // suffixMax[n - 1] = arr[n - 1];

    // for (int i = 1; i < n; i++) {

    // prefixMax[i] = Math.max(prefixMax[i - 1], arr[i]);
    // suffixMax[j] = Math.max(suffixMax[j + 1], arr[j]);
    // j--;

    // }

    // int total = 0;
    // for (int i = 0; i < arr.length; i++) {
    // int leftMax = prefixMax[i];
    // int rightMax = suffixMax[i];
    // if (arr[i] < leftMax && arr[i] < rightMax) {
    // total += (Math.min(leftMax, rightMax) - arr[i]);
    // }
    // }
    // return total;

    // }

    // Optimal T=O(N) , S=O(1)
    public int trap(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return 0;
        }

        int n = arr.length;
        int l = 0;
        int r = n - 1;
        int leftMax = 0;
        int rightMax = 0;
        int total = 0;

        while (l < r) {
            leftMax = Math.max(leftMax, arr[l]);
            rightMax = Math.max(rightMax, arr[r]);
            if (leftMax < rightMax) {
                total += (leftMax - arr[l]);
                l++;

            } else {
                total += (rightMax - arr[r]);
                r--;
            }

        }
        return total;

    }

}
