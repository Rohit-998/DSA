
public class p16 {

    public static void print(int n) {
        int k = 65;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print((char) k + " ");
            }
            k++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        print(5);
    }
}
