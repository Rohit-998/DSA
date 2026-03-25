
import java.util.ArrayList;
import java.util.List;

public class UnionOfTwoSortedArray {
    // Brute T=O(n1logn + n2logn + o(n1+n2)) S=O(n1+n2) + O(n1+n2)
    // public static int[] union(int[] arr1, int[] arr2) {
    //     Set<Integer> st = new HashSet<>();
    //     for (int i = 0; i < arr1.length; i++) {
    //         st.add(arr1[i]);
    //     }
    //     for (int i = 0; i < arr2.length; i++) {
    //         st.add(arr2[i]);
    //     }
    //     int[] result = new int[st.size()];
    //     int i = 0;
    //     for (Integer value : st) {
    //         result[i++] = value;
    //     }
    //     return result;
    // }

    //Optimal T=O(n1+n2)  S=O(n1+n2)
    public static int[] union(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;

        int n = arr1.length;
        int m = arr2.length;

        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                if (list.isEmpty() || list.get(list.size() - 1) != arr1[i]) {
                    list.add(arr1[i]);

                }
                i++;
            } else {
                if (list.isEmpty() || list.get(list.size() - 1) != arr2[j]) {
                    list.add(arr2[j]);

                }
                j++;
            }
        }
        while (i < n) {
            if (list.isEmpty() || list.get(list.size() - 1) != arr1[i]) {
                list.add(arr1[i]);

            }
            i++;
        }
        while (j < m) {
            if (list.isEmpty() || list.get(list.size() - 1) != arr2[j]) {
                list.add(arr2[j]);

            }
            j++;
        }
        int[] result = new int[list.size()];
        int k = 0;
        for (Integer value : list) {
            result[k++] = value;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr1 = {2, 4, 6};
        int[] result = union(arr, arr1);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
