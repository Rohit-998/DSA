package medium;

public class rotateImage {

    // Brute T = O(N×M) , S=O(N×M)
    // public static void rotate(int[][] arr) {

    //     int nRows = arr.length;
    //     int nCols = arr[0].length;

    //     int[][] ans = new int[nRows][nCols];

    //     for (int i = 0; i < nRows; i++) {
    //         for (int j = 0; j < nCols; j++) {
    //             ans[j][nRows - 1 - i] = arr[i][j];

    //         }
    //     }
    //     for (int i = 0; i < nRows; i++) {
    //         for (int j = 0; j < nCols; j++) {
    //             arr[i][j] = ans[i][j];
    //         }
    //     }

    // }
    
    // Brute T = O(N×M) , S=O(1)
    public static void rotate2(int[][] arr) {
        int nRows = arr.length;
        int nCols = arr[0].length;

        for (int i = 0; i < nRows; i++) {
            for (int j = i+1; j < nCols; j++) {
              int temp = arr[i][j];
              arr[i][j] = arr[j][i];
              arr[j][i] = temp;
            }
        }

        for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < nCols/2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][nCols-j-1];
                arr[i][nCols-j-1] = temp;
            }
        }

    }
}
