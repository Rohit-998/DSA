package hard;

import java.util.Arrays;

public class missingAndRepeatingNo {

    // Brute T = O(N^3), S=O(1)
    // public int[] findMissingAndRepeatedValues(int[][] grid) {
    // int[] ans = new int[2];
    // int n = grid.length;
    // int m = grid[0].length;
    // int N2 = n * n;

    // for (int k = 1; k <= N2; k++) {
    // int count = 0;

    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < m; j++) {
    // if (grid[i][j] == k) {
    // count++;
    // }
    // }
    // }
    // if (count == 0) {
    // ans[1] = k;
    // } else if (count > 1) {
    // ans[0] = k;
    // }
    // }
    // return ans;
    // }

    // Better T = O(N^2), S=O(N)
    // public int[] findMissingAndRepeatedValues(int[][] grid) {
    // int[] ans = new int[2];
    // int n = grid.length;
    // int m = grid[0].length;
    // int N2 = n * n;

    // int[] hashArr = new int[N2 + 1];
    // Arrays.fill(hashArr, 0);

    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < m; j++) {
    // hashArr[grid[i][j]] += 1;
    // }
    // }

    // for (int i = 1; i < hashArr.length; i++) {
    // if (hashArr[i] > 1) {
    // ans[0] = i;
    // } else if (hashArr[i] == 0) {
    // ans[1] = i;
    // }
    // }
    // return ans;
    // }

    // OptimalT = O(N^2), S=O(1)
    // public int[] findMissingAndRepeatedValues(int[][] grid) {
    // int[] ans = new int[2];

    // int n = grid.length;
    // int m = grid[0].length;
    // int N = n * n;

    // long sum = 0;
    // long sumSq = 0;

    // long s1N = (1L * N * (N + 1)) / 2;
    // long s2N = (1L * N * (N + 1) * (2L * N + 1)) / 6;

    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < m; j++) {
    // sum += grid[i][j];
    // sumSq += 1L * grid[i][j] * grid[i][j];
    // }
    // }

    // long XY = s1N - sum;
    // long X2Y2 = s2N - sumSq;
    // long XPY = X2Y2 / XY;

    // long x = (XY + XPY) / 2;
    // long y = (XPY - XY) / 2;

    // ans[0] = (int) y;
    // ans[1] = (int) x;

    // return ans;
    // }


  
}
