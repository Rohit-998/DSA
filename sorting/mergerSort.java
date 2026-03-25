

public class mergerSort{
    
     public static void sort(int[] arr , int low , int high ){

         if (low >=high) {
            return;
         }
         int mid = low + (high-low)/2;
         sort(arr, low, mid);
         sort(arr, mid+1,high);
         merge(arr, low, mid, high);




     }


     public static void merge(int[] arr , int low , int mid,int high ){
         int[] temp = new int[high - low + 1];

         int left = low;
         int right = mid +1;
         int i =0;
     
        while (left<=mid && right <= high) {
            if (arr[left]<arr[right]) {
                temp[i++] = arr[left++];
               
            }else{
                temp[i++] = arr[right++];
              
            }
        }
        while(left<=mid){
            temp[i++] = arr[left++];
        }
        while(right<=high){
            temp[i++] = arr[right++];
        }
        for (int j = low; j <= high; j++) {
            arr[j] = temp[j-low];
        }

     }
public static void main(String[] args) {
    int[] arr = {3,4,6,1,2};
    sort(arr, 0, arr.length-1);
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
}






}