package easy;

public class findSecondLargestElementInArray {

    // Bette approch O(2N)
    
    
    // public static int getSecondLargestElement(int[] arr) {
    //     int max = arr[0];
    //     int secondMax = -1;
    //     for (int i = 1; i < arr.length; i++) {
    //         if (arr[i] > max) {
    //             max = arr[i];
    //         }
    //     }
    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] >= secondMax && arr[i] != max) {
    //             secondMax = arr[i];
    //         }
    //     }
    //     return secondMax;
    // }

    // Bette approch O(N)


    public static int getSecondLargestElement(int[] arr) {
        int max = arr[0];
        int secondMax = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max && arr[i] != max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        return secondMax;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 56, 763, 763, 132};
        System.out.println("Second Largest Element Is " + getSecondLargestElement(arr));
    }

}
