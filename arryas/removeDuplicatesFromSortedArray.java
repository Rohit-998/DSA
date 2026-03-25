
public class removeDuplicatesFromSortedArray {

    // Brute Force Nlog(N) + N
    // public static int removeDuplicate(int[] arr) {
    //     Set<Integer> st = new LinkedHashSet<>();
    //     for (int i = 0; i < arr.length; i++) {
    //         st.add(arr[i]);
    //     }
    //     int i = 0;
    //     for (int value : st) {
    //         arr[i++] = value;
    //     }
    //     return i;
    // }

    // Optimal O(N)

    public static int removeDuplicate(int[] arr) {
     
        int i = 1;
        int j;

        for (j = 1; j < arr.length; j++) {

            if (arr[j] != arr[j - 1]) {
                arr[i++] = arr[j];
            }

        }
        return i;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 5, 6};
        int uniqueCount = removeDuplicate(arr);
        for (int i = 0; i < uniqueCount; i++) {
            System.out.println(arr[i]);
        }
    }
}
