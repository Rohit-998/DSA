package medium;

import java.util.HashMap;
import java.util.Map;

public class countSubArraysSumEqualsK {

    // Brute T = O(N^3) , S=O(1)
    // public static int find(int[] arr, int T) {
    //     int ans = 0;

    //     for (int i = 0; i < arr.length; i++) {

    //         for (int j = i + 1; j < arr.length; j++) {
    //             int sum = 0;
    //             for (int k = i; k < j; k++) {
    //                 sum += arr[k];
    //                 if (sum == T)
    //                     ans++;

    //             }
    //         }
    //     }
    //     return ans;
    // }

    // Brute T = O(N^2) , S=O(1)
    // public static int find(int[] arr, int T) {
    //     int ans = 0;

    //     for (int i = 0; i < arr.length; i++) {
    //         int sum = 0;
    //         for (int j = i; j < arr.length; j++) {
    //             sum += arr[j];
    //             if (sum == T) {
    //                 ans++;
    //             }
    //         }
    //     }
    //     return ans;
    // }
    
    

    // Optimal T= O(N*LogN) , S= O(N)

    public static int find(int[] arr, int T){

        int ans = 0;
        int preSum = 0;
        Map<Integer,Integer> map = new HashMap<>();

        map.put(0,1);


       for (int i = 0; i < arr.length; i++) {
          preSum+=arr[i];

          int rem = preSum-T;
          ans +=map.getOrDefault(rem,0);
          map.put(preSum, map.getOrDefault(preSum,0)+1);
       }
       return ans;
    }

    


}
