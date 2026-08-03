package Stack;

import java.util.Stack;

public class infixToPostfix {

    // T=O(2N) , S=O(N)
    public static int precedence(char c) {
        if (c == '+' || c == '-') {
            return 1;
        }
        if (c == '*' || c == '/') {
            return 2;
        }

        if (c == '^') {
            return 3;
        }
        return -1;
    }

    public static String infiToPofi(String s) {

        String ans = "";
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s
                    .charAt(i) >= '0' && s.charAt(i) <= '9')) {
                ans += s.charAt(i);
            } else if (s.charAt(i) == '(') {
                st.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    ans += st.pop();
                }
                st.pop();
            } else {

                while (!st.isEmpty() && precedence(s.charAt(i)) <= precedence(st.peek())) {
                    ans += st.pop();
                }
                st.push(s.charAt(i));

            }

        }
        while (!st.isEmpty()) {
            ans += st.pop();
        }

        return ans;

    }

}
