package Queue;

class queue {
    int size;
    int[] queue;
    int currSize = 0;
    int start, end = -1;

    public queue(int size) {
        this.size = size;
        this.queue = new int[size];
    }

    // T=O(1)
    public void push(int data) {
        if (currSize == size) {
            System.out.println("Queue Is Full");
            return;
        }
        if (currSize == 0) {
            start = 0;
            end = 0;
            queue[0] = data;
            currSize++;

        } else {
            end = (end + 1) % size;
            queue[end] = data;
            currSize++;
        }

    }

    // T=O(1)
    public void pop() {
        if (currSize == 0) {
            System.out.println("Queue Is Empty");
            return;
        }
        if (currSize == 1) {
            start = -1;
            end = -1;
        } else {
            start = (start + 1) % size;
        }
        currSize--;
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

class queueLL {
    Node start = null;
    Node end = null;
    int size = 0;
 
    
    // T=O(1)
    public void push(int data) {
        Node newNode = new Node(data);
        if (size == 0) {
            start = newNode;
            end = newNode;
        } else {
            end.next = newNode;
            end = newNode;
        }
        size++;
    }

    // T=O(1)
    public void pop() {
        if (size == 0) {
            System.out.println("Queue Is Empty");
            return;
        }
        if (size == 1) {
            start = null;
            end = null;
        } else {
            start = start.next;
        }
        size--;
    }
    

}

public class Implementation {

}
