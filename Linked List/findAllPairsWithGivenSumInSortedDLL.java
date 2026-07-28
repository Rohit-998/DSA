import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findAllPairsWithGivenSumInSortedDLL {


    // Brute  T=O(N^2) , S=O(1)
    // public static List<List<Integer>> find(DNode head , int sum) {

    //     List<List<Integer>> ans = new ArrayList<>();

    //     if (head == null || head.next == null) {
    //         return ans;
    //     }
    //     DNode temp1 = head;
       
    //     while (temp1!=null) {
           
    //         DNode temp2 = temp1.next;
    //         while (temp2!=null && temp1.data + temp2.data <= sum) {
    //             if (temp1.data+temp2.data==sum ) {
    //                 ans.add(Arrays.asList(temp1.data,temp2.data));
    //             }
    //             temp2 = temp2.next;
    //         }
    //         temp1 = temp1.next;
    //     }
    //     return ans;
    // }



     
    // Optimal T=O(2N) , S=O(1)
    public static List<List<Integer>> find(DNode head , int sum){
        List<List<Integer>> ans = new ArrayList<>();
         if (head == null || head.next == null) {
            return ans;
        }

        DNode left=head;
        DNode right = head;

        while (right.next!=null) {
            right = right.next;
        }
        
        while (left.data<right.data) {
            if (left.data+right.data==sum) {
                ans.add(Arrays.asList(left.data, right.data));
                left = left.next;
                right = right.prev;
            }else if ((left.data + right.data) <sum) {
                left=left.next;
            }else{
                right = right.prev;
            }
        }
         
        return ans;



    }




}
