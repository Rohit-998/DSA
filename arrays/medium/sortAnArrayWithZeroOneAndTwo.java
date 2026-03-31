package medium;

import java.util.ArrayList;
import java.util.List;

public class sortAnArrayWithZeroOneAndTwo {

    // Brute T=O(NlogN) , S=O(N)
    // public static void Sort(int[] arr, int low, int high) {
    //     if (low >= high) {
    //         return;
    //     }
    //     int mid = low + (high - low) / 2;
    //     Sort(arr, low, mid);
    //     Sort(arr, mid + 1, high);
    //     merge(arr, low, mid, high);

    // }

    // public static void merge(int[] arr, int low, int mid, int high) {
    //     List<Integer> list = new ArrayList<>();
    //     int left = low;
    //     int right = mid + 1;
    //     while (left <= mid && right <= high) {
    //         if (arr[left] <= arr[right]) {
    //             list.add(arr[left++]);
    //         } else {
    //             list.add(arr[right++]);
    //         }
    //     }
    //     while (left <= mid) {
    //         list.add(arr[left++]);
    //     }
    //     while (right <= high) {
    //         list.add(arr[right++]);
    //     }
    //     for (int i = low; i <= high; i++) {
    //         arr[i] = list.get(i - low);
    //     }
    // }
    
    //Better T=O(2N) S=O(1);

    // public static void Sort(int[] arr){
    //    int c0=0;
    //    int c1=0;
    //    int c2=0;

    //    for (int i = 0; i < arr.length; i++) {
    //        if (arr[i]==0) {
    //         c0++;
    //        }else if (arr[i]==1) {
    //         c1++;
    //        }else{
    //         c2++;
    //        }
    //    }
    //    for (int i = 0; i < c0; i++) {
    //      arr[i] = 0;
    //    }
    //    for (int i = c0; i < c0+c1; i++) {
    //      arr[i] = 1;
    //    }
    //    for (int i = c0+c1; i < arr.length; i++) {
    //      arr[i] = 2;
    //    }
    // }

  // Optimal (Dutch National Flag Algorithm) T=O(N) , S=O(1)

  public static void Sort(int[] arr){
    int low = 0;
    int n = arr.length;
    int high = n-1;
    int mid = 0;

    for (int i = 0; i < n; i++) {
      if (arr[mid]==0) {
        int temp = arr[mid];
        arr[mid] = arr[low];
        arr[low] = temp;
        mid++;
        low++;
      }else if (arr[mid]==1) {
        mid++;
      }else{
        int temp = arr[mid];
        arr[mid] = arr[high];
        arr[high] = temp;
        high--;
      }
    }
  }



    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 1, 1, 1, 2, 0, 0, 1, 0, 2 };
        Sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
   
    
}
