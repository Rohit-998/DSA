import java.util.Arrays;

public class numberAppearsOneTImeInArray {

    // Brute Force T=O(N*N) S=(1)

    // public static int find(int[] arr) {
    //     for (int i = 0; i < arr.length; i++) {
    //         int c = 0;
    //         for (int j = 0; j < arr.length; j++) {
    //             if (arr[i] == arr[j]) {
    //                 c++;
    //             }

    //         }
    //         if (c == 1) {
    //             return arr[i];
    //         }
    //     }
    //     return -1;
    // }

    // Better T=O(N+N+N) S=O(Max+1)

    // public static int find(int[] arr) {
    //     int max = arr[0];
    //     for (int i = 1; i < arr.length; i++) {
    //         if (max < arr[i]) {
    //             max = arr[i];
    //         }
    //     }
    //     int[] hash = new int[max + 1];
    //     Arrays.fill(hash, 0);
    //     for (int i = 0; i < arr.length; i++) {
    //         hash[arr[i]]++;
    //     }

    //     for (int i = 0; i < arr.length; i++) {
    //         if (hash[arr[i]] == 1) {
    //             return arr[i];
    //         }
    //     }
    //     return 0;
    // }

    // Optimal T=O(N) ,S=(1)

    public static int find(int[] arr) {
        int xor = arr[0];
        for (int i = 1; i < arr.length; i++) {
            xor ^= arr[i];
        }
        return xor;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 4, 4 };
        System.out.println(find(arr));
    }
}
