package easy;
public class maxConsecutiveOnesInArray {
    //Optimal T=O(N) S=O(1)
    public static int find(int[] arr) {

        int sum = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                sum++;
                max = Math.max(max, sum);
            } else {
                sum = 0;
            }

        }
        return max;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 0, 1, 1, 1, 1, 1 };
        System.out.println(find(arr));
    }
}
