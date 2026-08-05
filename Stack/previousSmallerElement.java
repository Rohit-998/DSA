package Stack;

import java.util.Stack;

public class previousSmallerElement {
    
    // T=O(2N) . S=O(2N)
    public static int[] preSmallerEle(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> st= new Stack<>();

        for (int i = 0; i < ans.length; i++) {
            while (!st.isEmpty() && st.peek()>=nums[i]) {

                st.pop();
                
            }
            ans[i] = st.isEmpty()?-1:st.peek();
            st.push(nums[i]);
        }
        return ans;
    }


}
