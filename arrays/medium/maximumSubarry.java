package medium;

//Brute T=O(N^3) , S = O(1)
public class maximumSubarry {
    // public static int find(int[] arr){

    // int max = Integer.MIN_VALUE;
    // for (int i = 0; i < arr.length; i++) {
    // for (int j =i; j < arr.length; j++) {
    // int sum = 0;
    // for (int k = i; k < j; k++) {
    // sum+= arr[k];
    // max = Math.max(max,sum);

    // }
    // }
    // }
    // return max;
    // }
    
    // Brute T=O(N^2) , S = O(1)
    // public static int find(int[] arr) {

    //     int max = Integer.MIN_VALUE;
    //     for (int i = 0; i < arr.length; i++) {
    //         int sum = 0;
    //         for (int j = i; j < arr.length; j++) {

    //             sum += arr[j];
    //             max = Math.max(max, sum);

    //         }
    //     }
    //     return max;
    // }

    //Optimal T=O(N) , S = O(1)

    public static int find(int[] arr){
        int max = Integer.MIN_VALUE;
        int sum = 0;
    

        for (int i = 0; i < arr.length; i++) {
             
            sum += arr[i];
            max = Math.max(sum, max);

            if (sum < 0) {
                sum = 0;
            }

        }
        return max;
    }
    

    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(find(arr));
    }
}
