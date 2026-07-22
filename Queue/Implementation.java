package Queue;

class Queue {
    int size;
    int[] queue;
    int currSize = 0;
    int start, end = -1;

    public Queue(int size) {
        this.size = size;
        this.queue = new int[size];
    }
    // T=O(1)
    public void push(int data) {
        if (currSize == size){
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
            System.out.println("Stack Is Empty");
        } else if (currSize == 1) {
            start = -1;
            end = -1;
        } else {
            start = (start + 1) % size;
            currSize--;

        }
    }
}

public class Implementation {

}
