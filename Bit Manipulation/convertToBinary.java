
public class convertToBinary {
    
    // T=O(LogN) , S=O(LogN)
    public static String convert2Binary(int n) {

        String res = "";

        while (n >0) {
            if (n % 2 == 0) {
                res += "0";
            } else {
                res += "1";
            }
            n = n / 2;
        }
        return new StringBuilder(res).reverse().toString();

    }

    public static void main(String[] args) {
        System.out.println(convert2Binary(2));
    }

}
