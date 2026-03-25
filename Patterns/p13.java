
public class p13 {

    public static void print(int n) {
        int k = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k++ + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        print(5);
    }
}
