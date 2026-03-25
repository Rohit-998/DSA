public class p6 {
    public static void print(int n){
        
        for(int i=1;i<=n;i++){
            int num = 1;
            for(int j=1;j<=n-i+1;j++){
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        print(5);
    }
}