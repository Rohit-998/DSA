


public class reverseArray {

   public static void revrseArray(int i,int j,int[] arr){
    if (i>=j) {
        return; 
    }
    
    int temp = arr[i];
    arr[i]=arr[j];
    arr[j] = temp;

    revrseArray(i+1, j-1, arr);

   }

  

   

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        revrseArray(0, nums.length - 1, nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }
}
