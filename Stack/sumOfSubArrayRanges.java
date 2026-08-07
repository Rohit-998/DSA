package Stack;

import java.util.Stack;

public class sumOfSubArrayRanges {

    // Brute T=O(N^2) , S=O(1)
    // public long subArrayRanges(int[] nums) {

    // long sum = 0;

    // for (int i = 0; i < nums.length; i++) {
    // long max = nums[i];
    // long min = nums[i];
    // for (int j = i+1; j < nums.length; j++) {
    // max = Math.max(max, nums[j]);
    // min = Math.min(min, nums[j]);
    // sum += (max - min);
    // }
    // }

    // return sum;

    // }


     // Optimal  T= O(N) ,S= O(N)
    private int[] findNse(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] nse = new int[n];

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return nse;
    }

    private int[] findNge(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] nge = new int[n];

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            nge[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return nge;
    }

    private int[] findPse(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] pse = new int[n];

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return pse;

    }

    private int[] findPge(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] pge = new int[n];

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                st.pop();
            }
            pge[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return pge;

    }

    private long sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int[] pse = findPse(arr);
        int[] nse = findNse(arr);
        long sum = 0;

        for (int i = 0; i < n; i++) {

            long left = i - pse[i];
            long right = nse[i] - i;
            long freq = 1L * left * right;
            sum += (freq * arr[i]);

        }
        return sum;

    }

    private long sumSubarrayMax(int[] arr) {
        int n = arr.length;
        int[] pge = findPge(arr);
        int[] nge = findNge(arr);
        long sum = 0;

        for (int i = 0; i < n; i++) {

            long left = i - pge[i];
            long right = nge[i] - i;
            long freq = 1L * left * right;
            sum += (freq * arr[i]);

        }
        return sum;

    }

    public long subArrayRanges(int[] nums) {
        return sumSubarrayMax(nums) - sumSubarrayMins(nums);
    }

}
