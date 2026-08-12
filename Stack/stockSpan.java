package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class stockSpan {
    // Brute T=O(Number Of Days) , S = T=O(Number Of Next Calls)
    // class StockSpanner {
    // List<Integer> list;

    // public StockSpanner() {
    // list = new ArrayList<>();
    // }

    // public int next(int price) {
    // list.add(price);
    // int cnt = 1;
    // for(int i = list.size()-2 ; i>=0 ; i--){
    // if (list.get(i)<=price) {
    // cnt++;
    // }else{
    // break;
    // }
    // }
    // return cnt;
    // }
    // }

    // Brute T=O(2N) , S = T=O(N)
    class StockSpanner {

        Stack<int[]> st = new Stack<>();
        int idx = -1;

        public StockSpanner() {
            idx = -1;
            st.clear();

        }

        public int next(int price) {
            idx++;
            while (!st.isEmpty() && st.peek()[0] <= price) {
                st.pop();
            }
            int ans = idx - (st.isEmpty() ? -1 : st.peek()[1]);
            st.push(new int[] {price,idx});

          return ans;
        }
    }
}
