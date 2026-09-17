public class MaximumPointsFromCards {
 

    // T=O(2N) , S=O(1)
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int lSum = 0;
        int rSum = 0;
        int max = 0;
        int j = n - 1;

        for (int i = 0; i < k ; i++) {
            lSum += cardPoints[i];
        }

        max = lSum;

        for (int i = k - 1; i >= 0; i--) {
            lSum -= cardPoints[i];
            rSum += cardPoints[j--];
            max = Math.max(max, lSum + rSum);
        }
        return max;
    }

}