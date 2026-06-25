package medium;

public class setMatrixZeroes {
    // T=O(N × M × (N+M)), S=O(1)
    // public static void solve(int[][] arr) {
    //     int Nrows = arr.length;
    //     int Ncols = arr[0].length;

    //     for (int i = 0; i < Nrows; i++) {
    //         for (int j = 0; j < Ncols; j++) {
    //             if (arr[i][j] == 0) {
    //                 for (int col = 0; col < Ncols; col++) {
    //                     if (arr[i][col] != 0) {
    //                         arr[i][col] = -1;
    //                     }

    //                 }
    //                 for (int row = 0; row < Nrows; row++) {
    //                     if (arr[row][j] != 0) {
    //                         arr[row][j] = -1;
    //                     }

    //                 }
    //             }
    //         }

    //     }
    //     for (int i = 0; i < Nrows; i++) {
    //         for (int j = 0; j < Ncols; j++) {
    //             if (arr[i][j] == -1) {
    //                 arr[i][j] = 0;
    //             }
    //         }
    //     }

    // }

    // Better T = O(2 × N × M), S = O(N + M)
    // public static void solve(int[][] arr) {

    // int Nrows = arr.length;
    // int Ncols = arr[0].length;
    // int[] rows = new int[Nrows];
    // int[] cols = new int[Ncols];

    // for (int i = 0; i < Nrows; i++) {
    // for (int j = 0; j < Ncols; j++) {
    // if (arr[i][j] == 0) {
    // rows[i] = 1;
    // cols[j] = 1;
    // }
    // }

    // }

    // for (int i = 0; i < rows.length; i++) {
    // if (rows[i] == 1) {

    // for (int j = 0; j < Ncols; j++) {
    // arr[i][j] = 0;
    // }

    // }
    // }
    // for (int j = 0; j < cols.length; j++) {
    // if (cols[j] == 1) {

    // for (int i = 0; i < Nrows; i++) {
    // arr[i][j] = 0;
    // }

    // }
    // }

    // }

    // Optimal T= O(N × M) , S = O(1)

    public static void solve(int[][] arr) {

        int Nrows = arr.length;
        int Ncols = arr[0].length;
       
        int col0 = 1;

        for (int i = 0; i < Nrows; i++) {
            for (int j = 0; j < Ncols; j++) {
                if (arr[i][j] == 0) {
                    arr[i][0] = 0;
                    if (j!=0)
                    arr[0][j] = 0;
                    else
                        col0=0;
                    
                }
            }

        }

        for (int i = 1 ; i<Nrows ; i++){
            for (int j = 1; j < Ncols; j++) {
                if (arr[i][j]!=0) {
                    if (arr[i][0]==0 || arr[0][j]==0) {
                        arr[i][j]=0;
                    }
                }
            }
        }
        if (arr[0][0]==0) {
            for (int j = 0; j < Ncols; j++) {
                arr[0][j] = 0;
            }
        }
        if (col0==0) {
            for (int i = 0; i < Nrows; i++) {
                arr[i][0]=0;
            }
        }
    }

}
