package hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergreOverLApping {

    // Brute T=O(NlogN) + O(2N) , S=O(N)
    // public static int[][] Merge(int[][] intervals) {
    // List<int[]> list = new ArrayList<>();

    // Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

    // for (int i = 0; i < intervals.length; i++) {
    // int start = intervals[i][0];
    // int end = intervals[i][1];

    // if (!list.isEmpty() && end <= list.get(list.size() - 1)[1]) {
    // continue;
    // }

    // for (int j = i + 1; j < intervals.length; j++) {
    // if (intervals[j][0] <= end ) {
    // end = Math.max(end, intervals[j][1]);
    // }else{
    // break;
    // }
    // }

    // list.add(new int[] { start, end });

    // }
    // return list.toArray(new int[list.size()][]);

    // }

    //Optimal T=O(NlogN) + O(N) , S=O(N)

    public static int[][] Merge(int[][] intervals) {
        List<int[]> list = new ArrayList<>();

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int start = intervals[0][0];
        int end = intervals[0][1];
        
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= end) {
                end = Math.max(end, intervals[i][1]);
            }else{
                 list.add(new int[]{start,end});
                 start = intervals[i][0];
                 end = intervals[i][1];
            }
            
        }
        list.add(new int[] { start, end });

        return list.toArray(new int[list.size()][]);
        
    }

}
