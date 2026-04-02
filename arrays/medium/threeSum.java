package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class threeSum {

    // Brute T=O(N^3) S=O(N^2)

    // public static List<List<Integer>> find(int[] arr) {

    // Set<List<Integer>> set = new HashSet<>();

    // for (int i = 0; i < arr.length; i++) {
    // for (int j = i+1; j < arr.length; j++) {
    // for (int k = j+1; k < arr.length; k++) {
    // if (arr[i]+arr[j]+arr[k]==0 ) {
    // List<Integer> temp = new ArrayList<>();
    // temp.add(arr[i]);
    // temp.add(arr[j]);
    // temp.add(arr[k]);
    // Collections.sort(temp);
    // set.add(temp);

    // }
    // }
    // }
    // }

    // return new ArrayList<>(set);

    // }

    // Better T=O(N^2*LogM) S=O(N)
    // public static List<List<Integer>> find(int[] arr) {

    // Set<List<Integer>> set = new HashSet<>();

    // for (int i = 0; i < arr.length; i++) {
    // Map<Integer, Integer> map = new HashMap<>();

    // for (int j = i + 1; j < arr.length; j++) {
    // int rem = -(arr[i] + arr[j]);
    // if (!map.containsKey(rem)) {
    // map.put(arr[j], j);

    // } else {
    // List<Integer> temp = new ArrayList<>();
    // temp.add(arr[i]);
    // temp.add(arr[j]);
    // temp.add(rem);
    // Collections.sort(temp);
    // set.add(temp);

    // }
    // }
    // }

    // return new ArrayList<>(set);

    // }

    // Optimal T=O(NlogN) + O(N^2) ,S=O(No of Unique Triplets)

    public static List<List<Integer>> find(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = n-1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum > 0) {
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(arr[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while (j<k && arr[j]==arr[j-1]) {
                        j++;
                    }
                    while (j<k && arr[k] == arr[k + 1]) {
                        k--;
                    }
                }
            }
        }

        return ans;

    }

}
