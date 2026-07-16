public class howManyTimeArrayRotated {


   // T=O(LogN) , S=O(1)
    public static int find(int[] arr){

        int low = 0 ; 
        int n = arr.length;
        int high = n-1;
        int ans = -1;
        int min  = Integer.MAX_VALUE;

        while (low<=high) {
            int mid = low +(high-low)/2;


            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                if (min > arr[low]) {
                    min = arr[low];
                    ans = low;
                }
                
                low++;
                high--;
                continue;
            }







            if (arr[mid]>=arr[low]) {
                if (min>=arr[low]) {
                    min = arr[low];
                    ans  = low;
                
                }
                low = mid +1;
            }else{
                if (min>=arr[mid]) {
                    min = arr[mid];
                    ans = mid;
                }
                high = mid-1;
            }
        }
        return ans;

    }
}
