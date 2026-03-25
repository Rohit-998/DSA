
public class p15 {

    public static void print(int n) {
       
        for (int i = n; i >= 1; i--) {
             int k = 65;
            for (int j = 1; j <= i; j++) {
                System.out.print((char)k++ + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        print(5);
    }
}
