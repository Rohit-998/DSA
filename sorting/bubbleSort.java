
public class bubbleSort {

    public static void sort(int[] arr) {

        for (int i = arr.length - 1; i >= 0; i--) {
        int didswap=0;
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    didswap =1;
                }
            }
                if (didswap==0) {
                    break;
                }
        }

    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 2, 3, 6};

        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
