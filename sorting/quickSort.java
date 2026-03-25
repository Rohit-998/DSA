
public class quickSort {

    public static int partition(int[] arr, int low, int high) {
        int piviot = arr[low];

        int i = low;
        int j = high;

        while (i < j) {

            while (arr[i] <= piviot && i <= high - 1) {
                i++;
            }
            while (arr[j] > piviot && j >= low + 1) {
                j--;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }

        arr[low] = arr[j];
        arr[j] = piviot;

        return j;

    }

    public static void sort(int[] arr, int low, int high) {

        if (low < high) {
            int parIn = partition(arr, low, high);
            sort(arr, low, parIn - 1);
            sort(arr, parIn + 1, high);
        }

    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 1, 2};
        sort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
