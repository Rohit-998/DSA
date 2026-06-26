package hard;

import java.util.ArrayList;
import java.util.List;

public class pascalTriangle {
  

    // T = O(R) , S=O(1)
    static long NRFindElement(int N, int R) {
      
        
        
        if (R == 0 || R == N) {
            return 1;
        }

        R = Math.min(R, N - R);

        long ans = 1;

        for (int i = 1; i <= R; i++) {
            ans = ans * (N - i + 1) / i;
        }

        return ans;
    }


    // T = O(N) , S=O(1)

    public static List<Integer> pascalRow(int N){

        List<Integer> list =  new ArrayList<>();
        long ans = 1;
        list.add(1);
        
        for (int i = 1; i <= N; i++) {
           ans*=(N-i+1);
           ans/=i;
           list.add((int)ans);

        }

        return list;

    }

    // T = O(N*R) , S=O(1)
    public static List<List<Integer>> pascalTri(int N){
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(pascalRow(i));
        }
     
        return list;
    }
   
}
