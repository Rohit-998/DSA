
public class p17 {

    public static void print(int n) {

        for (int i = 1; i <= n; i++) {
            int k = 65;
            for (int j = 1; j <= 2*i-1; j++) {

                System.out.print((char) (k + j - 1) + " ");
                k++;
            }
            
            System.out.println();
        }
    }

    public static void main(String[] args) {
        print(5);
    }
}
