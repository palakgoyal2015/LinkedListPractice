class Node{
    int data;
    Node next;
    Node(int data){
       this.data=data;
       this.next=null;
    }
}
public class reverseLinkedList {

    private static Node convertToLL(int[] arr){
        Node head=new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
    private static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    private static Node reverseLL(Node head){
        Node prev=null;
        Node current=head;
        Node next=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
         head=prev;
         return head;
    }
    private static Node evenOdd(Node head){
        Node temp=head;
        Node evenHead=null,evenTail=null;
        Node oddHead=null,oddTail=null;
        while(temp!=null){
           if(temp.data%2==0){
            if(evenHead==null){
                evenHead=evenTail=temp;
            }else{
                evenTail.next=temp;
                evenTail=evenTail.next;
            }
           }else{
            if(oddHead==null){
                oddHead=oddTail=temp;
            }else{
                oddTail.next=temp;
                oddTail=oddTail.next;
            }
           }
           temp=temp.next;
        }
        if(evenTail!=null){
            evenTail.next=oddHead;
        }
        if(oddTail!=null){
            oddTail.next=null;
        }
        return (evenHead!=null) ? evenHead : oddHead;

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        Node head=convertToLL(arr);
       
        // head=reverseLL(head);
        head=evenOdd(head);
         print(head);
    }
}
