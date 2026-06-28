package hard;

public class countInversion {

    //Brute T=O(N^2) , S=O(1)
    public static int find(int[] arr) {
        
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }


    
}
