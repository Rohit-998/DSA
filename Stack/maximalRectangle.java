package Stack;

import java.util.Stack;

public class maximalRectangle {

    public static int largestHist(int[] arr) {
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
            int element = st.pop();
            int nse = n;
            int pse = st.isEmpty() ? -1 : st.peek();
            maxArea = Math.max(maxArea, arr[element] * (nse - pse - 1));
        }
        return maxArea;


    }

    // T=O(M*N) + O(N*2M) , S = (N*M)+O(N)
    public int maximalRec(char[][] matrix) {

        int r = matrix.length;
        int c = matrix[0].length;
        int[][] preSum = new int[r][c];

        for (int i = 0; i < c; i++) {
            int sum = 0;
            for (int j = 0; j < r; j++) {
                if (matrix[j][i] == '1') {
                    sum += 1;
                    preSum[j][i] = sum;
                } else {
                    sum = 0;
                    preSum[j][i] = sum;
                }
            }
        }

        int maxArea = 0;

        for (int i = 0; i < r; i++) {
          maxArea = Math.max(maxArea, largestHist(preSum[i]));
        }

        return maxArea;

    }

}
