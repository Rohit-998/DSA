package Stack;

import java.util.Stack;

public class largestRectangelInHistogram {
    // Brute T=O(N^2) , S=O(1)
    // public int largestRectangleArea(int[] heights) {

    // int n = heights.length;
    // int area = 0;

    // for (int i = 0; i < n; i++) {
    // int h = heights[i];
    // int b = 1;
    // for (int j = i + 1; j < n; j++) {
    // if (heights[j] < heights[i]) {
    // break;
    // }
    // b++;
    // }
    // for (int j = i; j >= 0; j--) {
    // if (heights[j] < heights[i]) {
    // break;
    // }
    // b++;
    // }
    // area = Math.max(area, h * (b - 1));
    // }

    // return area;
    // }

    public static int[] finPse(int[] arr) {
        int n = arr.length;
        int[] pse = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);

        }
        return pse;
    }

    public static int[] findNse(int[] arr) {
        int n = arr.length;
        int[] nse = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);

        }
        return nse;
    }

    // Better T=O(5N) , O(2N)
    // public int largestRectangleArea(int[] heights) {
    // int n = heights.length;

    // int[] pse = finPse(heights);
    // int[] nse = findNse(heights);
    // int area = 0;

    // for (int i = 0; i < n; i++) {
    // area = Math.max(area, heights[i] * (nse[i] - pse[i] - 1));
    // }

    // return area;

    // }


    // Optimal T=O(2N) , O(N)
    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                int element = st.pop();
                int nse = i;
                int pse = st.isEmpty() ? -1 : st.peek();
                maxArea = Math.max(maxArea, arr[element] * (nse - pse - 1));

            }
            st.push(i);
            
        }
        while (!st.isEmpty()) {
           int nse = n;
           int element = st.pop();
           int pse = st.isEmpty() ? -1 : st.peek(); 
           maxArea = Math.max(maxArea, arr[element] * (nse - pse - 1));

        }




        return maxArea;

    }

}
