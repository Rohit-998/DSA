public class convertToDecimal {


    // T=O(len(binary)) , S=O(1)
    public static int convert2Decimal(String bin){
        int len = bin.length();
        int num = 0;
        int p2 = 1;
        for (int i = len-1; i >=0; i--) {
            if (bin.charAt(i)=='1') {
                num+=p2;
            }
            p2*=2;
        }
        return num;

    }

    public static void main(String[] args) {
        System.out.println(convert2Decimal("1101"));
    }




    
}
