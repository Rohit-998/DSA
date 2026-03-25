
import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoSortedArray {

    public static int[] union(int[] arr1, int[] arr2) {
        Set<Integer> st = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            st.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            st.add(arr2[i]);
        }
        int[] result = new int[st.size()];
        int i = 0;
        for (Integer value : st) {
            result[i++] = value;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr1 = {2, 4, 6, 1, 6, 8, 9};
        int[] result = union(arr, arr1);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
