package Stack;

import java.util.Stack;

public class removeKDigitis {

      // T=O(3N)  , S=O(2N) 
      public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
 
        st.push(num.charAt(0));
        for (int i = 1; i < num.length(); i++) {
          while (!st.isEmpty() && k>0 && (st.peek()-'0')>(num.charAt(i)-'0')) {
            st.pop();
            k--;
          }
          st.push(num.charAt(i));
        }
        while (k > 0 && !st.isEmpty()) {
          st.pop();
          k--;
        }
        if(st.isEmpty()){
          return "0";
        }
        String ans = "";
        while (!st.isEmpty()) {
          ans+=st.pop();
        }

        StringBuilder sb = new StringBuilder(ans).reverse();
        while (sb.length() > 1 && sb.charAt(0) == '0') {
          sb.deleteCharAt(0);
        }
        return  sb.toString();

    }
    
}
