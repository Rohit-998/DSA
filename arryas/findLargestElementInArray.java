
public class findLargestElementInArray {

    public static int getLargestElement(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 56, 763, 132};
        System.out.println("Largest Element Is " + getLargestElement(arr));
    }
}
