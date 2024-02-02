import java.util.Collection;

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

    public boolean nodeExist(int data) {
        Node current = this.head;

        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current=current.next;
        }

        return false;
    }
    public Node SearchNode(int data) {
        Node current = this.head;

        while (current != null) {
            if (current.data == data) {
                return current;
            }
            current=current.next;
        }

        return null;
    }
    public void insertNextNode(int currentData,int newData){
        Node currentNode;
        if((currentNode=SearchNode(currentData))==null){
            System.out.println("Previous Node Should not be NULL");
        }else{
            Node newNode=new Node(newData);
            newNode.next=currentNode.next;
            currentNode.next=newNode;

        }
    }

}
