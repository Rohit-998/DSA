public class firstAndLastOcc {

    // Brute T=O(N) , S=O(1)
    public static int[] find(int[] arr, int K) {

        int first = -1;
        int last = -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == K) {
                if (first == -1) {
                    first = i;

                }
                last = i;

            }
        }

        return new int[] { first, last };

    }

    // Optimal T=O(LogN) , S=O(1)

    public static int[] find(int[] arr, int K) {

        int low = 0;
        int n = arr.length;
        int high = n - 1;
        int lb = n;
        int ub = n;

        while (low <= high) {

            int mid = low + (high - low) / 2;
            if (arr[mid] >= K) {
                lb = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        low = 0;
        high = n - 1;
        while (low <= high) {

            int mid = low + (high - low) / 2;
            if (arr[mid] > K) {
                ub = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (lb == n || arr[lb] != K) {
            return new int[] { -1, -1 };
        }
        return new int[] { lb, ub };

    }

}