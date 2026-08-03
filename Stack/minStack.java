package Stack;

import java.util.Stack;

public class minStack {
    // All Operations: T=O(1)
    // S=O(N) for Stack
    class MinStack {
        Stack<Long> st;
        long mini;

        public MinStack() {
            st = new Stack<>();

        }

        public void push(int value) {
            long val = value;
            if (st.isEmpty()) {
                mini = val;
                st.push(val);
            } else {
                if (mini < val) {
                    st.push(val);
                } else {
                    st.push(2 * val - mini);
                    mini = val;
                }
            }
        }

        public void pop() {
           if (st.isEmpty()) {
            return;
           }
           long x = st.pop();
           if (x < mini) {
             mini = 2 * mini - x; 
           }
        }


        public int top() {
            if (st.isEmpty()) {
                return -1;
            }
           long x = st.peek();
           if (mini < x) {
            return (int) x;
           } else {
            return (int) mini;
           }

        }

        public int getMin() {
          return (int) mini;
        }
    }

    /**
     * Your MinStack object will be instantiated and called as such:
     * MinStack obj = new MinStack();
     * obj.push(value);
     * obj.pop();
     * int param_3 = obj.top();
     * int param_4 = obj.getMin();
     */
}
