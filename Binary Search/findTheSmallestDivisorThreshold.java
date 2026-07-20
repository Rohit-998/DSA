public class findTheSmallestDivisorThreshold {

    public static long calculate(int[] nums, int num) {
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += (long) Math.ceil((double) nums[i] / num);
        }
        return sum;
    }



    // Brute T=(max(nums)*N)
    // public int smallestDivisor(int[] nums, int threshold) {

    //     int max = Integer.MIN_VALUE;
    //     for (int i = 0; i < nums.length; i++) {
    //         max = Math.max(max, nums[i]);
    //     }

    //     for (int i = 1; i <= max; i++) {
    //         if (calculate(nums, i) <= threshold) {
    //             return i;
    //         }
    //     }

    //     return 0;

    // }


    // Optimal T=O(max(nums)*logN) , S=O(1)
    public int smallestDivisor(int[] nums, int threshold) {
        int ans = 1;

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }

        int low=1;
        int high = max;
        while (low<=high) {
            int mid = low+(high-low)/2;
            if (calculate(nums, mid)<=threshold) {
                ans = mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }


        return ans;

    }
}
