class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
    Node(int data,Node n){
        this.data=data;
        this.next=n;
    }
   
}

public class Linked {
    private static Node convertArrtoll(int[] arr){
        Node head=new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
    private static int lengthLL(Node head){
        int count=0;
        Node temp=head;
        while(temp!=null){
         count++;
         temp=temp.next;
        }
        return count;
    }
    private static int checkIfPresent(Node head,int val){
        Node temp=head;
        while(temp!=null){
            if(temp.data==val){
                return 1;
            }else{
                temp=temp.next;
            }
        }
        return 0;
    }
    private static void print(Node head){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
    private static Node deleteHead(Node head){
    
        Node mover=head;
        if(mover==null){
            return head;
        }
      return mover.next;
    }
    private static Node deleteLastElement(Node head){
     
        Node temp=head;
        if(temp.next==null||temp==null){
            return null;
        }
    while(temp.next.next!=null){
        temp=temp.next;
    }
    temp.next=null;
        return head;
    }
    private static Node deleteKthElement(Node head,int pos){
        if(head==null){
            return null;

        }
        if(pos==0){
            return head.next;
        }
       
        Node temp=head;
        int count=0;
        while(temp.next!=null&&count<pos-1){
            temp=temp.next;
            count++;
           
        }
        if(temp==null||temp.next==null){
            return head;
        }
        temp.next=temp.next.next;
        return head;
    }
    private static Node addHead(Node head,int val){
        if(head==null){
           head.data=val;
            return head;
        }
        Node temp=new Node(val,head);
        return temp;

    }
    private static Node addatend(Node head,int val){
        if(head==null){
            return new Node(val,null);
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new Node(val,null);
        return head;
    }
    private static Node addatpos(Node head,int val,int pos){
        if(pos==0){
            return new Node(val,head);
        }
    int count=0;
    Node temp=head;
    while(temp.next!=null&&count<pos-1){
        temp=temp.next;
        count++;
    }
    temp.next=new Node(val,temp.next);
    return head;
    }
 public static void main(String[] args) {
    int[] arr={1,2,3,4,5};
    Node n=new Node(arr[0]);
    Node head=convertArrtoll(arr);
    // System.out.println(head.data);
    // Node temp=head;
    // while(temp!=null){
    //     System.out.println(temp.data);
    //     temp=temp.next;
    // }
    //   System.out.println(lengthLL(head));
    // System.out.println(checkIfPresent(head, 13));
//    head=deleteHead(head);
//   print(head);
//   head=deleteLastElement(head);
//   print(h1ead);
//   head=deleteKthElement(head,4 );
//   print(head);
head=addatpos(head, 5,2);
print(head);


 }
    
}
