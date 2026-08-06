package Stack;


import java.util.Stack;

public class sumOfSubArrayMini {

    // Brute T=O(N^2) , S=O(1)
    // public int sumSubarrayMins(int[] arr) {

    // int miniSum = 0;
    // int mod = (int) (1e9 + 7);
    // for (int i = 0; i < arr.length; i++) {
    // int mini = arr[i];
    // miniSum = (miniSum + mini) % mod;
    // for (int j = i + 1; j < arr.length; j++) {
    // mini = Math.min(mini, arr[j]);
    // miniSum = (miniSum + mini) % mod;
    // }

    // }
    // return miniSum;

    // }

    // 
    public static int[] nse(int[] arr) {

        int n = arr.length;
        int[] map = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            map[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return map;
    }

    public static int[] pse(int[] arr) {
        int n = arr.length;
        int[] map = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            map[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return map;
    }

    // Optimal T=O(3N) , S=O(4N)

    public int sumSubarrayMins(int[] arr) {

        int[] nse = nse(arr);
        int[] pse = pse(arr);
        long total = 0;
        int mod = (int) (1e9 + 7);

        for (int i = 0; i < arr.length; i++) {
            long left = i - pse[i];
            long right = nse[i] - i;

            long contribution = (right * left * arr[i]) % mod;
            total = (total + contribution) % mod;

        }
        return (int) total;

    }

}
