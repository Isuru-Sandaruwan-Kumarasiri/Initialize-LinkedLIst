public class DoublyLinkedListDriver {
    public static void main(String[] args) {
        doublyLinkedList list=new doublyLinkedList();
        list.insertAtBeginning(1);
        list.insertAtBeginning(2);
        list.insertAtBeginning(3);
        list.insertAtBeginning(4);


        list.traverseBackward();
        list.traverseBackward();

        list.display();
    }
}
