
public class rotateArraybyKthElementLeft {
    //Brute T = O(N+d) S=O(d)

    // public static void rotate(int[] arr, int d) {
    //     d %= arr.length;
    //     int[] temp = new int[d];
    //     System.arraycopy(arr, 0, temp, 0, d);
    //     for (int i = d; i < arr.length; i++) {
    //         arr[i - d] = arr[i];
    //     }
    //     for (int i = arr.length - d; i < arr.length; i++) {
    //         arr[i] = temp[i - (arr.length - d)];
    //     }
    // }
    // Optimal  T = O(2N) S=O(1)

    public static void reverse(int[] arr, int s, int e) {
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }

    public static void rotate(int[] arr, int d) {
        d = d % arr.length;
        reverse(arr, 0, d - 1);
        reverse(arr, d, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        rotate(arr, 3);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
