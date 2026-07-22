
class Node{
    int data ;
    Node next;
    Node(int data , Node node){
        this.data = data;
        this.next= node;
    }
    Node(int data){
        this.data=data;
        this.next = null;
    }
}





public class implemention {
    
// T=O(1)
private static Node convertArr2LL(int[] arr){
    Node head = new Node(arr[0]);
    Node mover = head;
    for (int i = 1; i < arr.length; i++) {
       Node temp = new Node(arr[i]);
       mover.next = temp;
       mover = temp;
    } 
    return head;

}
// T=O(1)
private static int lengthOfLL(Node head){
    int L = 0;
     Node temp = head;
      while (temp!=null) {
     
   
    L++;
    temp=temp.next;
    
   }
   return L;
}
// T=O(1)
private static int checkIfPresent(Node head , int val){
    int ans = 0;
    Node temp = head;
    while (temp!=null) {
     
        if (temp.data==val) {
           ans=1;
           break; 
        }
    temp=temp.next;
    
   }
   return ans;
}

public static void main(String[] args) {
    int[] arr = {2,3,4,5,6};
    Node head = convertArr2LL(arr);
    Node temp = head;
   while (temp!=null) {
     
    System.out.println(temp.data);
    temp=temp.next;
    
   }
   System.out.println(lengthOfLL(head));
   System.out.println(checkIfPresent(head, 2));
}


    
}
