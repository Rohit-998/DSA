package Trees;

public class postOrderTraversal {
    public class Node {

        int data;
        Node Left;
        Node Right;

        public Node(int data) {
            this.data = data;
        }
    }

    // T=O(N) ,S=O(N)
    public void postOrder(Node node){
        if (node==null) {
            return;
        }
        postOrder(node.Left);
        postOrder(node.Right);
        System.out.println(node.data);
    }
    





}
