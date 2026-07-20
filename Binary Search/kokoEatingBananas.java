public class kokoEatingBananas {

    public static long calTime(int[] piles, int hourly) {
        long time = 0;

        for (int i = 0; i < piles.length; i++) {
            time += (long) Math.ceil((double) piles[i] / hourly);
        }

        return time;
    }

    // Brute T=O(max(piles)*N) , S=O(1)
    // public int minEatingSpeed(int[] piles, int h) {
    // int max = Integer.MIN_VALUE;

    // for (int i = 0; i < piles.length ; i++) {
    // max = Math.max(max, piles[i]);
    // }

    // for (int i = 1; i < max; i++) {
    // if (calTime(piles, i)<=h) {
    // return i;
    // }
    // }
    // return max;

    // }


    // Optimal T=O(max(piles)*logN) , S=O(1)
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        int ans  = -1;

        for (int i = 0; i < piles.length; i++) {
            max = Math.max(max, piles[i]);
        }

        int low = 1;
        int high = max;

        while (low<=high) {

            int mid = low+(high-low)/2;
            if (calTime(piles, mid)<=h) {
                ans = mid;
                high = mid-1;
                
            }else{
                low=mid+1;
            }
            
        }
        return ans;

    }

}
