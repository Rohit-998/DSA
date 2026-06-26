package hard;

public class countSubArraysWithXorAsK {

    // Brute T=O(N^3) , S=O(1)

    // public static int count(int[] arr, int K) {
    //     int n = arr.length;
    //     int c = 0;
    //     for (int i = 0; i < n; i++) {
    //         for (int j = i; j < n; j++) {
    //             int xor = 0;
    //             for (int l = i; l <= j; l++) {
    //                 xor ^= arr[l];
    //             }
    //             if (xor == K) {
    //                 c++;
    //             }
    //         }

    //     }
    //     return c;
    // }

    //Better T=O(N^2) , S=O(1)

    public static int count(int[] arr, int K) {
        int n = arr.length;
        int c = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int xor = 0;
               
                    xor ^= arr[j];
                
                if (xor == K) {
                    c++;
                }
            }

        }
        return c;
    }
}
