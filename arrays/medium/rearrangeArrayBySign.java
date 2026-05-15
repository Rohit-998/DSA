package medium;

public class rearrangeArrayBySign {

    // Brute T= O(2N) , S = O(N)
    // public static void reArrange(int[] arr) {

    // int[] pos = new int[arr.length / 2];
    // int[] neg = new int[arr.length / 2];
    // int j = 0;
    // int k = 0;

    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] >= 0) {
    // pos[j++] = arr[i];
    // } else {
    // neg[k++] = arr[i];
    // }
    // }
    // j = 0;
    // k = 0;

    // for (int i = 0; i < arr.length - 1; i += 2) {
    // arr[i] = pos[j++];
    // arr[i + 1] = neg[k++];
    // }
    // }

    // Optimal T= O(N) , S = O(N)

    public static void reArrange(int[] arr) {
        int pos = 0;
        int neg = 1;
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                ans[pos] = arr[i];
                pos += 2;
            } else {
                ans[neg] = arr[i];
                neg += 2;
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, -2, -5, 2, -4 };
        reArrange(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
