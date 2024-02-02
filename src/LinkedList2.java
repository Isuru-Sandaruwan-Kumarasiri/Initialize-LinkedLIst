public class LinkedList2 {
    private Node head;
    private Node tail;


    public LinkedList2() {

        this.head = null;
        this.tail = null;
    }


    public void insertNodeFront(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;

        } else {
            newNode.next = head;
            head = newNode;
        }

    }


    public void insertNodeRear(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;

        } else {
            tail.next = newNode;
            tail = newNode;
        }

    }


    public void displayNodes() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + ", ");
            temp = temp.next;

        }
        System.out.println(" ");

    }


    public boolean nodeExists( int x){

        Node current = this.head;

        while (current != null) {
            if (current.data == x)
                return true;
            current = current.next;
        }
        return false;

    }


    public Node search( int x) {

        Node current = head;
        if (nodeExists(x) == true) {
            while (current != null) {
                if (current.data == x) {
                    return current;

                }
                current = current.next;
            }
        }
        else {
            return null;

        }
        return null;
    }


    public void insertNext(int prev_data, int newData) {
        Node prev_node;
        if ((prev_node=search(prev_data) )== null){
            System.out.println("The given previuos node ");
            return ;
        }

        Node newNode = new Node(newData);
        newNode.next = prev_node.next;
        prev_node.next = newNode;
    }

    public void deleteNode(int target_value){


        if(nodeExists(target_value)==true){
            Node temp=this.head;
            while(temp!=null){
                if (temp.next.data==target_value){
                    Node target_node=temp.next;
                    //Node previous_node=target_node.next;
                    temp.next=target_node.next;
                    target_node=null;
                    return;
                }
//                     System.out.println("run");
                temp=temp.next;
            }

        }else {
            System.out.println("Not Found");
        }


    }
//    public void deleteNode(int target_value) {
//        if (nodeExists(target_value)) {
//            if (head.data == target_value) {
//                head = head.next;
//            } else {
//                Node temp = head;
//                while (temp.next != null && temp.next.data != target_value) {
//                    temp = temp.next;
//                }
//                if (temp.next != null) {
//                    temp.next = temp.next.next;
//                } else {
//                    System.out.println("Target node not found");
//                }
//            }
//        } else {
//            System.out.println("Not Found");
//        }
//    }





}
