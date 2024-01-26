public class LinkedList {
    Node head;
    Node tail;

    LinkedList(){
        this.head=null;
        this.tail=null;
    }

    public void addFront(int data){
       Node newNode=new Node(data);

       if(head==null){
           head=newNode;
           tail=newNode;
       }else{
           newNode.next=head;
           head=newNode;
       }
    }
    public void addEnd(int data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
        }
    }

    public void displayAllElements(){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
