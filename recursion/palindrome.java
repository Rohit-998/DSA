
public class palindrome {

    class Solution {

        public static boolean isPalindrome(int x) {
            int count = 0;
            String s = String.valueOf(x);
            for (int i = 0; i <= s.length() / 2; i++) {
                if (s.charAt(i) == s.charAt(s.length() - i - 1)) {
                    count++;
                }else{
                    count =0;
                    break;
                }

            }
            return count != 0;

        }
    }

    public static void main(String[] args) {

        System.out.println(Solution.isPalindrome(121));

    }

}
