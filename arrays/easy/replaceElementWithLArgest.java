package easy;

public class replaceElementWithLArgest {

    public int[] replaceElements(int[] arr) {
        int[] ans = new int[arr.length];
        int max = arr[arr.length - 1];

        for (int i = arr.length - 1; i > -1; i--) {
            if (i == arr.length - 1) {
                ans[i] = -1;
            } else {
                max = Math.max(max, arr[i + 1]);
                ans[i] = max;
            }

        }
        return ans;
    }
}
