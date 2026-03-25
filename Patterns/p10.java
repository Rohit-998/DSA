
public class p10 {

    public static void print(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int star = i > n ? 2 * n - i : i;
            for (int j = 1; j <= star; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        print(5);
    }
}
