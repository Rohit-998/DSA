package Stack;

import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Queue;

public class slidingWindow {

    // Brute T=O((N-k)*k) S=O(N-k);
    // public int[] maxSlidingWindow(int[] nums, int k) {

    // int n = nums.length;
    // List<Integer> list = new ArrayList<>();

    // for (int i = 0; i <= n - k; i++) {
    // int max = Integer.MIN_VALUE;
    // for (int j = i; j <= i+k-1; j++) {
    // max = Math.max(max, nums[j]);
    // }
    // list.add(max);
    // }

    // return list.stream()
    // .mapToInt(Integer::intValue)
    // .toArray();
    // }

    // Optimal T=O(2N) S=O(N-k);

    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;

        Deque<Integer> dq = new ArrayDeque<>();
        int j = 0;

        int[] ans = new int[n - k + 1];

        for (int i = 0; i < n; i++) {
            if (!dq.isEmpty() && dq.peekFirst()<=i-k ) {
                dq.pollFirst();
            }
            while (!dq.isEmpty() && nums[dq.peekLast()]<nums[i]) {
                dq.pollLast();
                
            }
            dq.offerLast(i);
            if (i >= k - 1) {
                ans[j++] = nums[dq.peekFirst()];
            }
        }
        return ans;


    }

}
