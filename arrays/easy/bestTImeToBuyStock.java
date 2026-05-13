package easy;

public class bestTImeToBuyStock {
    
    public static int find(int[] a){
        int mini = a[0];
        int maxProfit = 0;
        for (int i = 1; i < a.length; i++) {
            int profit  =  a[i] - mini;
            maxProfit = Math.max(maxProfit, profit);
            mini = Math.min(mini, a[i]);
        }
        return maxProfit;
    }
}
