import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class intersectionOfTwoSortedArray {

    // Brute Force T=O(N1*N2) S=O(N2)
    // public static int[] intersection(int[] arr1, int[] arr2) {

    // int[] visited = new int[arr2.length];
    // Arrays.fill(visited, 0);
    // List<Integer> list = new ArrayList<>();

    // for (int i = 0; i < arr1.length; i++) {
    // for (int j = 0; j < arr2.length; j++) {
    // if (arr1[i] == arr2[j] && visited[j] == 0) {
    // list.add(arr1[i]);
    // visited[j] = 1;
    // break;

    // }
    // if (arr1[i] < arr2[j]) {
    // break;
    // }
    // }

    // }
    // int[] result = new int[list.size()];
    // int i = 0;
    // for (Integer value : list) {
    // result[i++] = value;
    // }
    // return result;
    // }
   
    //Optimal T=O(N1+N2) S=O(1)
    public static int[] intersection(int[] arr1, int[] arr2) {

        int i = 0;
        int j = 0;
        List<Integer> list = new ArrayList<>();

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                list.add(arr1[i]);
                i++;
                j++;

            }

        }
        int[] result = new int[list.size()];
        int k = 0;
        for (Integer value : list) {
            result[k++] = value;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int[] arr1 = { 2, 4, 5, 6 };
        int[] result = intersection(arr, arr1);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

}