package Stack;

class stack {
    int top = -1;
    int size;
    int[] arr;

    public stack(int size) {
        this.size = size;
        this.arr = new int[size];
    }

 
    // T=O(1)
    public void push(int data) {
        arr[++top] = data;
    }

    // T=O(1)
    public void pop() {
        top--;
    }

    // T=O(top)
    public void print(){
        if (top==-1) {
            System.out.println("Stack Is Empty");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class implementtation {

    public static void main(String[] args) {
        stack st = new stack(10);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.print();
        st.pop();
        st.pop();
        st.pop();
        st.print();
        

    }

}
