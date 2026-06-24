package medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Better T=O(NlogN), S=O(1)
public class longestConsecutive {
    // public static int find(int[] arr){
    // Arrays.sort(arr);
    // int currCount =0;
    // int longest = 1;
    // int lastSmaller = Integer.MIN_VALUE;

    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] - 1 == lastSmaller) {
    // currCount++;
    // lastSmaller = arr[i];
    // }else if (arr[i]!=lastSmaller){
    // currCount = 1;
    // lastSmaller = arr[i];
    // }
    // longest = Math.max(longest , currCount);

    // }

    // return longest;
    // }


    // Optimal T=O(3N) , S=O(N)

    public static int find(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int longest =1 ;

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        for (Integer ele : set) {
            if (!set.contains(ele - 1)) {
                int cnt = 1;
                int x = ele;
                while (set.contains(x+1)) {
                    x++;
                    cnt++;
                }
                longest = Math.max(cnt, longest);
            }


        }
        return longest;
    }
}
