package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class majorityElementsNby3TImes {
    // Brute T=O(N^2) S=O(1)

    // public static List<Integer> find(int[] arr) {
    // int n = arr.length;
    // List<Integer> list = new ArrayList<>();

    // for (int i = 0; i < arr.length; i++) {
    // int ele = arr[i];
    // int c = 0;
    // for (int j = 0; j < arr.length; j++) {
    // if (ele == arr[j]) {
    // c++;
    // }
    // }
    // if (c > (n / 3) && !list.contains(ele)) {
    // list.add(ele);
    // }
    // }

    // return list;
    // }

    // Better T=O(NlogN) + O(N) , S=O(N)

    // public static List<Integer> find(int[] arr) {
    // int n = arr.length;
    // List<Integer> list = new ArrayList<>();
    // Map<Integer, Integer> map = new HashMap<>();
    // for (int i = 0; i < arr.length; i++) {
    // if (map.containsKey(arr[i])) {
    // map.put(arr[i], map.get(arr[i]) + 1);
    // } else {
    // map.put(arr[i], 1);
    // }
    // }
    // for (int i = 0; i < arr.length; i++) {
    // if (map.get(arr[i]) > (n / 3) && !list.contains(arr[i]) ) {
    // list.add(arr[i]);
    // }
    // }
    // return list;
    // }

    // Optimal (Moore's Voting Algorithm) T=O(N) , S=O(1)

    public static List<Integer> find(int[] arr) {
        int n = arr.length;
        List<Integer> list = new ArrayList<>();
        int el1 = -1;
        int c1 = 0;
        int el2 = -1;
        int c2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (c1 == 0 && arr[i] != el2) {
                c1=1;
                el1 = arr[i];
            } else if (c2 == 0 && arr[i] != el1) {
                c2=1;
                el2 = arr[i];
            } else if (arr[i] == el1) {
                c1++;
            } else if (arr[i] == el2) {
                c2++;
            } else {
                c1--;
                c2--;
            }
        }
         
        //verification 

        int vc1=0;
        int vc2=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==el1) {
                vc1++;
            }else if (arr[i]==el2) {
                vc2++;
            }
        }
        if (vc1>(n/3)) {
            list.add(el1);
        }
        if (vc2>(n/3)) {
            list.add(el2);
        }

        return list;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 3, 3, 2, 2, 2 };
        System.out.println(find(arr));
    }
}
