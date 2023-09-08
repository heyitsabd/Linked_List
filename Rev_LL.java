public class Rev_LL{
    Node head;
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    void addLast(int data){
        Node curr=head;
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
    }

    void rev(){
        Node prev=head;
        Node curr=head.next;
        if(head==null || head.next==null){
            return;
        }

        while(curr!=null){
            Node nextNode=curr.next;
            curr.next=prev;

            //Update
            prev=curr;
            curr=nextNode;
        }
        head.next=null;
        head=prev;
    }
    void print(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" -> ");
            curr=curr.next;
        }
        System.out.print("Null");
        System.out.println();
    }
    public static void main(String[] args) {
        Rev_LL ll=new Rev_LL();
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(5);
        ll.addLast(7);
        ll.addLast(9);
        ll.print();
        ll.rev();
        ll.print();
    }
}
