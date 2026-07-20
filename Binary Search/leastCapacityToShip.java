public class leastCapacityToShip {
    public static long calculateDays(int[] nums, int cap) {
        long days = 1;
        long load = 0;
        for (int i = 0; i < nums.length; i++) {
            if (load + nums[i] > cap) {
                days += 1;
                load = nums[i];

            } else {
                load += nums[i];
            }
        }
        return days;
    }

    // Brute T=O((sum-max)*N) , S=O(1)
    // public int shipWithinDays(int[] weights, int days) {

    // int max = Integer.MIN_VALUE;
    // int sum = 0;
    // for (int i = 0; i < weights.length; i++) {
    // max = Math.max(max, weights[i]);
    // sum+=weights[i];
    // }
    // for (int i = max; i <= sum; i++) {
    // if (calculateDays(weights, i)<=days) {
    // return i;
    // }
    // }
    // return -1;
    // }

    // Optimal T=O((NlogN) , S=O(1)
    public int shipWithinDays(int[] weights, int days) {

        int max = Integer.MIN_VALUE;
        int sum = 0;
        int ans = 0;
        for (int i = 0; i < weights.length; i++) {
            max = Math.max(max, weights[i]);
            sum += weights[i];
        }

        int low = max;
        int high = sum;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (calculateDays(weights, mid) <= days) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}
