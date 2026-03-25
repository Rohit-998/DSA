

public class prob1 {

   public static void printReccur(int i,int n){
    if(i>n){
        return ;
    }
    printReccur(i+1, n);
    System.out.println(i);

    
   }

   public static void main(String[] args) {
    printReccur(1, 5);
   }
}
