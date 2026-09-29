import java.util.Arrays;

public class longestSubStringWithoutRepeatingChar {
   
    // Brute T=O(N^2) , S=O(256)
    // public int lengthOfLongestSubstring(String s) {

       
    //     int length = 0;
    //     for (int i = 0; i < s.length(); i++) {
    //         int[] hash = new int[256];
    //         Arrays.fill(hash, 0);
    //         for (int j = i; j < s.length(); j++) {
    //             if (s.charAt(j) == 1) {
    //                 break;
    //             }
    //             int temp = j - i + 1;
    //             length = Math.max(temp, length);
    //             hash[s.charAt(j)] = 1;

    //         }

    //     }

    //     return length;

    // }

   // Optimal T=O(n) , S=O(256)
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int l =0;
        int r =0;

        int[] map = new int[256];
        Arrays.fill(map, -1);

        while(r<s.length()) {
            if ((map[s.charAt(r)]!=-1 )&& map[s.charAt(r)] >=l ) {
                l = map[s.charAt(r)]+1;
                map[s.charAt(r)]= r;
            }
            int length = r-l+1;
            maxLength = Math.max(maxLength, length);
            map[s.charAt(r)]= r;
            r++;

        }
       
        return maxLength;

    }

}
