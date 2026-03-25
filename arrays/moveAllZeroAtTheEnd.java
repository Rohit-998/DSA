
public class moveAllZeroAtTheEnd {
    
    public static void moveZero(int[] arr) {
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j++] = arr[i];
            }
        }
        for (int i = j; i < arr.length; i++) {
            arr[i] = 0;
        }

    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        moveZero(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
