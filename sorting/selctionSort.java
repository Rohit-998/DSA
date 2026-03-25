
public class selctionSort {

    public static int minimum(int[] arr, int i) {
        int min = arr[i];
        int index = i;
        for (int k = i + 1; k < arr.length; k++) {

            if (min > arr[k]) {
                min = arr[k];
                index = k;

            }

        }

        return index;
    }

    public static void sort(int[] arr) {
        int i = 0;
        int j = arr.length - 2;

        while (i <= j) {

            int minIndex = minimum(arr, i);
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            i++;

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
