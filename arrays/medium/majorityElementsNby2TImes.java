package medium;

import java.util.HashMap;
import java.util.Map;

public class majorityElementsNby2TImes {

    // Brute T=O(N^2) S=O(1)

    // public static int find(int[] arr){
    // int n = arr.length;

    // for (int i = 0; i < arr.length; i++) {
    // int ele = arr[i];
    // int c= 0;
    // for (int j = 0; j < arr.length; j++) {
    // if (ele==arr[j]) {
    // c++;
    // }
    // }
    // if (c>(n/2)) {
    // return ele;
    // }
    // }

    // return -1;
    // }

    // Better T=O(NlogN) + O(N) , S=O(N)

    // public static int find(int[] arr) {
    //     int n = arr.length;
    //     Map<Integer, Integer> map = new HashMap<>();
    //     for (int i = 0; i < arr.length; i++) {
    //         if (map.containsKey(arr[i])) {
    //             map.put(arr[i], map.get(arr[i]) + 1);
    //         } else {
    //             map.put(arr[i], 1);
    //         }
    //     }
    //     for (int i = 0; i < arr.length; i++) {
    //         if (map.get(arr[i]) > (n / 2)) {
    //             return arr[i];
    //         }
    //     }
    //     return -1;
    // }

    // Optimal (Moore's Voting Algorithm) T=O(N) , S=O(1)

    public static int find(int[] arr) {
        int n =arr.length;
        int c = 0;
        int el=0;
       

        for (int i = 0; i < n; i++) {
            if (c == 0) {
                c = 1;
                el = arr[i];
            } else if (arr[i] == el) {
                c++;
            }else{
                c--;
            }
        }
        
        //verification

        int verifyCount = 0;
        for (int i = 0; i < n; i++) {
         if (arr[i]==el) {
            verifyCount++;
         }
        }
        if (verifyCount>(n/2)) {
            return el;
        }else{
            return -1;
        }
       
    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 3, 3, 1, 2, 2 };
        System.out.println(find(arr));
    }

}
