package hard;

import java.util.Arrays;

public class Merge2SortedArrayWithoutExtraSpace {
    // Optimal T= O(min(m,n) + m·log m + n·log n) , S=O(1)
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = m - 1;
        int right = 0;

        while (left >= 0 && right < n) {

            if (nums1[left] > nums2[right]) {
                int temp = nums1[left];
                nums1[left] = nums2[right];
                nums2[right] = temp;
                right++;
                left--;
            } else {
                right++;
                left--;
            }

        }

        Arrays.sort(nums1, 0, m);
        Arrays.sort(nums2);

        for (int i = 0; i < n; i++) {

            nums1[m+i] = nums2[i];
            
        }

    }

    

}
