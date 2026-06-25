package medium;

import java.util.ArrayList;
import java.util.List;


// Optimal T=O(N*M) , S = O(N*M)
public class spiralMatrix {
    public static List<Integer> spiral(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        int top = 0;
        int bottom = n - 1;
        int right = m - 1;
        int left = 0;
        List<Integer> ans = new ArrayList<>();
        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                ans.add(arr[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                ans.add(arr[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(arr[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(arr[i][left]);
                }
                left++;
            }

        }
        return ans;
    }
}
