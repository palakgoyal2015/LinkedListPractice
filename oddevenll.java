class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
    Node(int d,Node n){
        data=d;
        next=n;
    }
}

public class oddevenll {
  private static Node convertToLL(int[] arr){
    Node head=new Node(arr[0]);
    Node temp=head;
  for(int i=1;i<arr.length;i++){
        temp.next=new Node(arr[i]);
        temp=temp.next;
  }
    return head;
  }
  private static Node print(Node head){
    Node temp=head;
    while(temp!=null){
        System.out.println(temp.data+" ");
        temp=temp.next;
    }
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
    return (evenHead!=null) ? evenHead :oddHead;
    
  }
  private static Node sort(Node head){
    Node heado=null;
    Node tailo=null;
    Node headt=null;
    Node tailt=null;
    Node headz=null;
    Node tailz=null;
    Node temp=head;
    while(temp!=null){
        if(temp.data==0){
            if(headz==null){
               headz=tailz=temp;
            }else{
                tailz.next=temp;
                tailz=tailz.next;
            }
        }else if(temp.data==1){
            if(heado==null){
               heado=tailo=temp;
            }else{
                tailo.next=temp;
                tailo=tailo.next;
            }
        }else if(temp.data==2){
            if(headt==null){
               headt=tailt=temp;
            }else{
                tailt.next=temp;
                tailt=tailt.next;
            }
        }
        temp=temp.next;
    }
    if(tailz!=null) tailz.next=heado;
    if(tailo!=null) tailo.next=headt;
    if(tailt!=null) tailt.next=null;
    return(headz!=null) ? headz :(heado!=null ? heado : headt);

  }
  
    public static void main(String[] args) {
        int arr[]={1,2,0,1,0,2};
        Node head=convertToLL(arr);
   
    head=sort(head);
        print(head);
    
    }
}
