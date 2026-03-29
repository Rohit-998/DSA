package medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {
    // Brute Force T = O(N*N) , S=O(2)

    // public static int[] find(int[] arr, int K) {
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = i + 1; j < arr.length; j++) {
    // if (arr[i] + arr[j] == K) {
    // return new int[]{i, j};
    // }
    // }
    // }
    // return new int[]{-1, -1};
    // }

    // Better T=O(N) , S=(N) if there are lot of collisions in hashMap the
    // T=O(NLogN)

    // public static int[] find(int[] arr, int K) {
    // Map<Integer, Integer> map = new HashMap<>();

    // for (int i = 0; i < arr.length; i++) {
    // int rem = K - arr[i];
    // if (map.containsKey(rem)) {
    // return new int[] { map.get(rem), i };
    // }
    // map.put(arr[i], i);
    // }
    // return new int[] { -1, -1 };
    // }

    // Optimal when no hashmap allowed (or when yes/no is asked). Two-pointer approach
    // T=O(NLogN)  S=O(1)
    public static boolean find2(int[] arr, int K) {
        Arrays.sort(arr);
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum > K)
                j--;
            else if (sum < K)
                i++;
            else
                return true;
        }
        return false; 
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 5 };
        int[] result = find(arr, 5);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

}
