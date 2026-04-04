package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class fourSum {

    // Brute T=O(N^4) S=(No Of Quads)

    // public static List<List<Integer>> find(int[] arr, int target) {

    //     int n = arr.length;
    //     Set<List<Integer>> set = new HashSet<>();
    //     for (int i = 0; i < n; i++) {
    //         for (int j = i + 1; j < n; j++) {
    //             for (int k = j + 1; k < n; k++) {
    //                 for (int l = k + 1; l < n; l++) {
    //                     long sum = arr[i];
    //                     sum += arr[j];
    //                     sum += arr[k];
    //                     sum += arr[l];
    //                     if (sum == target) {
    //                         List<Integer> temp = new ArrayList<>();
    //                         temp.add(arr[i]);
    //                         temp.add(arr[j]);
    //                         temp.add(arr[k]);
    //                         temp.add(arr[l]);
    //                         Collections.sort(temp);
    //                         set.add(temp);
    //                     }
    //                 }
    //             }
    //         }
    //     }
    //     return new ArrayList<>(set);

    // }

    // Better T=O(N^3 *(LogM)) , S = O(N + 2*(No Of quads))

    // public static List<List<Integer>> find(int[] arr, int target) {
    // int n = arr.length;
    // Set<List<Integer>> set = new HashSet<>();
    // for (int i = 0; i < n; i++) {

    // for (int j = i + 1; j < n; j++) {
    // Map<Integer, Integer> map = new HashMap<>();
    // for (int k = j + 1; k < n; k++) {

    // int rem = target - (arr[i] + arr[j] + arr[k]);
    // if (map.containsKey(rem)) {
    // List<Integer> temp = new ArrayList<>();
    // temp.add(arr[i]);
    // temp.add(arr[j]);
    // temp.add(arr[k]);
    // temp.add(rem);
    // Collections.sort(temp);
    // set.add(temp);
    // }
    // map.put(arr[k], k);
    // }
    // }
    // }
    // return new ArrayList<>(set);
    // }

    // Optimal T=O(N^3) S=O(No of quads)

    public static List<List<Integer>> find(int[] arr, int target) {
        Arrays.sort(arr);
        int n = arr.length;
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                if (j > i + 1 && arr[j] == arr[j - 1]) {
                    continue;
                }
                int k = j + 1;
                int l = n - 1;
                while (k < l) {
                    long sum = arr[i];
                    sum += arr[j];
                    sum += arr[k];
                    sum += arr[l];
                    if (sum == target) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        temp.add(arr[l]);
                        list.add(temp);
                        k++;
                        l--;
                        while (k < l && arr[k] == arr[k - 1]) {
                            k++;
                        }
                        while (k < l && arr[l] == arr[l + 1]) {
                            l--;
                        }
                    } else if (sum < target) {
                        k++;
                    } else {
                        l--;
                    }
                }
            }
        }
        return list;
    }

}
