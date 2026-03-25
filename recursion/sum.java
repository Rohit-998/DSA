public class sum {
    public static int sumRecur(int n ) {

        if (n==0) {
            return 0 ;
        }
        return n + sumRecur(n-1);
      
    }
    public static void main(String[] args) {
        System.out.println(sumRecur(2));
    }
}
