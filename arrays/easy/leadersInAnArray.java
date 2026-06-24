package easy;

import java.util.ArrayList;
import java.util.List;

public class leadersInAnArray {


    //Brute T = O(N^2) , S = O(N)
    // public static List<Integer> find(int[] arr){
    //     List<Integer> ans = new ArrayList<>();
    //     for (int i = 0; i < arr.length; i++) {
    //         Boolean leader = true;
    //         for (int j = i+1; j < arr.length; j++) {
    //             if (arr[j]>arr[i]) {
    //                 leader = false;
    //                 break;
    //             }
    
    //         }
    //         if (leader) {
    //            ans.add(arr[i]) ;
    //         }
    //     }
    //     return ans;
    // }

    //Optimal T = O(N) , S=O(N)

    public static List<Integer> find(int[] arr){
        List<Integer> ans = new ArrayList<>();

        int max = Integer.MIN_VALUE;

        for (int i = arr.length-1; i > 0; i--) {
            if (arr[i]>max) {
                ans.add(arr[i]);
                max = arr[i];
            }
        }

        return ans;
    
    
    
    
    }
}
