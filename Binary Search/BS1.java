public class BS1 {

    //T=O(LogN), S=O(1)
    public static int implemention(int[] arr, int T) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == T) {
                return mid;
            } else if (arr[mid] < T) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }


    // T=O(LogN), S=O(LogN)
    public static int recure(int[] arr, int low, int high, int T) {

        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (arr[mid] == T) {
            return mid;
        } else if (T > arr[mid]) {
            return recure(arr, mid + 1, high, T);
        }
        return recure(arr, low, mid - 1, T);

    }
}