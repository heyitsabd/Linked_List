public class LL{
    static int size=0;
    static Node head;
    // LL(){
    //     size=0;
    // }
    public class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
        
    }
        void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

    }

    void addLast(String data){
        Node newNode = new Node(data);
        Node currNode=head;
        if(head==null){
            head=newNode;
            return;
        }
        
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
        // newNode.next=null;
    }

    void print(){
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+ "->");
            currNode=currNode.next;
        }
        System.out.print("Null");
        System.out.println();
    }

    void del_first(){
        head=head.next;
        size--;
    }

    void del_last(){
        Node currNode=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            currNode=currNode.next;
        }
        currNode.next=null;
        size--;
    }

    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        LL list=new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("Cat");
        list.print();
        
        list.print();
        System.out.println(list.getSize());
        list.addFirst("This");
        list.addLast(".");
        list.print();
        System.out.println(list.getSize());
        list.del_last();
        list.print();
        System.out.println(list.getSize());
        
    }
}