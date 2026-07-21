import java.util.Arrays;

public class AgressiveCows {
    public static boolean canWePLace(int[] arr, int dist, int cows) {

        int currCows = 1;
        int last = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - last >= dist) {
                currCows++;
            }

            if (currCows >= cows) {
                return true;

            }

        }

        return false;
    }


    // Brute T=O((max-min)*N) , S=O(1)
    // public static int find(int[] arr, int cows) {
    //     Arrays.sort(arr);
    //     int min = arr[0];
    //     int max = arr[arr.length - 1];

    //     for (int i = 1; i <= max - min; i++) {
    //         if (canWePLace(arr, i, cows)) {
    //             continue;
    //         } else {
    //             return i - 1;
    //         }
    //     }

    //     return -1;

    // }

   // Optimal T=O(LogN*N) , S=O(1)

    public static int find(int[] arr, int cows) {

        Arrays.sort(arr);
  
        int low= 1;
        int high = arr[arr.length-1];
        while (low<=high) {
            int mid = low+(high-low)/2;
            if (canWePLace(arr, mid, cows)) {
          
                low=mid+1;
            }else{
                high = mid-1;
            }
        }
        return high;
    }
    

}
