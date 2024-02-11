public class CircularLinkedList {
    Node head;
    Node tail;

    public CircularLinkedList(){
        this.head=null;
        this.tail=null;
    }
    public void addNode(int data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;

        }else{
            tail.next=newNode;
        }
        tail=newNode;
        tail.next=head;
    }
    public void traverseList() {
        Node currentNode = head;

        if (head != null) {
            do {
                System.out.print(currentNode.data + ",");
                currentNode = currentNode.next;
            } while (currentNode != head);
        }
        System.out.println();
    }

    public boolean search(int data){
        Node currentNode=this.head;
        if(head==null){
            return false;
        }else{
            do{
                if(currentNode.data==data){
                    return true;
                }
                 currentNode=currentNode.next;
            }while(currentNode!=head);
            return false;


        }
    }
    public void delete(int data){
        Node current=this.head;
        if(head==null){
            return;
        }
        do{
            if(head==tail){
                head=null;
                tail=null; //if it has one element
            }  else {
                if(current.next.data==data){
                    Node targetNode=current.next;
                    current.next=targetNode.next;

                }
            }
           current=current.next;
        }while(current!=head);
    }

}
