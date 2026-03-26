import java.util.Arrays;

public class findMissingNumberFromArray {

    // Brute T=O(N*N) S=O(1)

    // public static int find(int[] arr, int N) {
    // int i = 0;
    // for (i = 1; i <= N; i++) {
    // int flag = 0;
    // for (int j = 0; j < N - 1; j++) {
    // if (arr[j] == i) {
    // flag = 1;
    // break;
    // }
    // }
    // if (flag == 0) {
    // return i;
    // }
    // }
    // return 0;
    // }

    // Better T=O(N+N) S=O(N)

    // public static int find(int[] arr, int N) {
    // int[] hash = new int[N + 1];
    // Arrays.fill(hash, 0);
    // for (int i = 0; i < arr.length; i++) {
    // hash[arr[i]] = 1;
    // }
    // for (int i = 1; i < hash.length; i++) {
    // if (hash[i] == 0) {
    // return i;
    // }
    // }
    // return 0;
    // }

    // Optimal using Sum T=O(N) S=(1)

    // public static int find(int[] arr, int N) {
    // int sum = N * (N + 1) / 2;
    // int sum2 = 0;
    // for (int i = 0; i < arr.length; i++) {
    // sum2 += arr[i];
    // }

    // return sum - sum2;
    // }

    // Optimal using XOR T=O(N) S=(1)
    public static int find(int[] arr, int N) {
        int XOR1= 0;
        int XOR2= 0;
        for (int i = 0; i < N-1; i++) {
             XOR1 ^=arr[i];
             XOR2 ^=(i+1);
        }
        XOR2^=N;

        return XOR1^XOR2;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5 };
        System.out.println(find(arr, 5));
    }

}
