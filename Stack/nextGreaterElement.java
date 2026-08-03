package Stack;

import java.util.HashMap;
import java.util.Stack;

public class nextGreaterElement {

    // Brute T= O(N1 * N2) , O(1)
    // public int[] nextGreaterEle(int[] nums1, int[] nums2) {

    // int[] ans = new int[nums1.length];
    // int k =0;
    // for (int i = 0; i < nums1.length; i++) {
    // int x = nums1[i];
    // int idxInNums2 = -1;
    // for (int j = 0; j < nums2.length; j++) {
    // if (nums2[j]==x) {
    // idxInNums2 = j;
    // }
    // }
    // if (idxInNums2==nums2.length-1) {
    // ans[k++] = -1;
    // }else{
    // boolean flag= false;
    // for (int j = idxInNums2+1; j < nums2.length; j++) {
    // if (x<nums2[j]) {
    // ans[k++] = nums2[j];
    // flag=true;
    // break;
    // }
    // }
    // if (!flag) {
    // ans[k++]=-1;
    // }

    // }

    // }
    // return ans;

    // }

    // Optimal: T=O(N1 + N2), S=O(N2)
    public int[] nextGreaterEle(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        for (int i = nums2.length - 1; i >= 0; i--) {
            int num = nums2[i];

            while (!st.isEmpty() && st.peek() <= num) {
                st.pop();
            }

            if (st.isEmpty()) {
                map.put(num, -1);
            } else {

                map.put(num, st.peek());
            }

            st.push(num);
        }

        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }

}
