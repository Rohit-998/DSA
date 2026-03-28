import java.util.HashMap;
import java.util.Map;

public class longestSubArrayWithSumK {

    // Brute T = O(N*N) S=O(1)
    // public static int find(int[] arr, int K) {
    //     int len = 0;

    //     for (int i = 0; i < arr.length; i++) {
    //         int sum = 0;
    //         for (int j = i; j < arr.length; j++) {

    //             sum += arr[j];

    //             if (sum == K) {

    //                 len = Math.max(len, j - i + 1);
    //             }
    //         }
    //     }

    //     return len;
    // }

    // Better T=O(N*logN) S=O(N)

    //  public static int find(int[] arr, int K){
    //     Map<Integer , Integer> preSumMap = new HashMap<>();
    //     int sum = 0;
    //     int maxLen = 0;

    //     for (int i = 0; i < arr.length; i++) {
    //         sum+=arr[i];
    //         if (sum==K) {
               
    //             maxLen = Math.max(maxLen, i+1);
                
    //         }
    //         int rem = sum - K;

    //         if (preSumMap.containsKey(rem)) {

    //             int len = i - preSumMap.get(rem);
    //             maxLen = Math.max(maxLen, len);
                
    //         }
    //         if (!preSumMap.containsKey(sum)){
    //               preSumMap.put(sum, i);
    //         }

    //     }
    //     return maxLen;
    //  }

    // Optimal (Only When Positive Elements are there) T=O(2N) S=O(1)
    
    public static int find(int[] arr, int K){
        
        int sum = arr[0];
        int maxLen = 0;
        int i = 0;
        int j = 0;
        int n = arr.length;
         
        while(j < n ) {
            while (i<=j && sum > K) {
                sum -= arr[i++];   
            }
            j++;
            if (j < n ) {
                sum+=arr[j];
            } if (sum == K) {
                maxLen = Math.max(maxLen, j-i+1);
            }
            

        }
        return maxLen;
    }


    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 1, 3 };
        System.out.println(find(arr, 4));
    }
}