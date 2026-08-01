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
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = data;
    }

    // T=O(1)
    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }
        top--;
    }

    // T=O(N)
    public void print() {
        if (top == -1) {
            System.out.println("Stack Is Empty");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

class Node {
    int data;
    Node next;

    Node(int data, Node node) {
        this.data = data;
        this.next = node;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class stackLL {

    Node top = null;
    int size = 0;
    
    // T=O(1)
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    // T=O(1)
    public void pop() {
        if (top == null) {
            System.out.println("stack is empty");
            return;
        }
        top = top.next;
        size--;
    }

    // T=O(N)
    public void print(){
        Node temp = top;
        while (temp != null) {
           System.out.println(temp.data);
            temp = temp.next;
        }
    }

}

public class implementtation {

    public static void main(String[] args) {
        // stack st = new stack(10);
        // st.push(1);
        // st.push(2);
        // st.push(3);
        // st.push(4);
        // st.push(5);
        // st.push(6);
        // st.push(7);
        // st.print();
        // st.pop();
        // st.pop();
        // st.pop();
        // st.print();
        stackLL st = new stackLL();
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
