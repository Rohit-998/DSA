
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class fruitIntoBaskets {

    // Brute T=O(N^2) , S=O(3);

    // public int totalFruit(int[] fruits) {

    // int maxLen = 0;
    // for (int i = 0; i < fruits.length; i++) {
    // Set<Integer> set = new HashSet<>();

    // for (int j = i; j < fruits.length; j++) {
    // set.add(fruits[j]);

    // if (set.size() <= 2) {

    // maxLen = Math.max(maxLen, j - i + 1);
    // } else {
    // break;
    // }

    // }
    // }
    // return maxLen;
    // }

    // Better T=O(2N) , S=O(3)
    // public int totalFruit(int[] fruits) {
    //     int l = 0;
    //     int r = 0;
    //     int maxLen = 0;
    //     int n = fruits.length;

    //     HashMap<Integer, Integer> map = new HashMap<>();
    //     while (r < n) {

    //         map.put(fruits[r], map.getOrDefault(fruits[r], 0) + 1);

    //         if (map.size() > 2) {
    //             while (map.size() > 2) {

    //                 map.put(fruits[l], map.get(fruits[l]) - 1);
    //                 if (map.get(fruits[l]) == 0) {
    //                     map.remove(fruits[l]);
    //                 }
    //                 l++;

    //             }
    //         }

    //         if (map.size()<=2) {
    //             maxLen=Math.max(maxLen, r-l+1);
               
    //         }
    //         r++;

    //     }
    //     return maxLen;
        

    // }


    // Optima; T=O(N) , S=O(3)

    public int totalFruit(int[] fruits) {
        int l = 0;
        int r = 0;
        int maxLen = 0;
        int n = fruits.length;
 
        HashMap<Integer,Integer> map = new HashMap<>();

        while (r<n) {
            
            map.put(fruits[r], map.getOrDefault(fruits[r], 0)+1);

            if (map.size()>2) {
                map.put(fruits[l], map.get(fruits[l])-1);
                if (map.get(fruits[l])==0) {
                    map.remove(fruits[l]);
                }
                l++;
            }

            if (map.size()<=2) {
                maxLen=Math.max(maxLen, r-l+1);
            }
            r++;



        }
        return maxLen;
    }

}
