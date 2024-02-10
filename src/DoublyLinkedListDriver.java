public class DoublyLinkedListDriver {
    public static void main(String[] args) {
        doublyLinkedList list=new doublyLinkedList();
        list.insertAtBeginning(1);
        list.insertAtBeginning(2);
        list.insertAtBeginning(3);
        list.insertAtBeginning(4);
        list.insertAtBeginning(5);


        System.out.println("traverseBackward");
        list.traverseBackward();

       System.out.println("\ntraverseForward");
        list.traverseForward();
       System.out.println("\n100 added 3rd position");
       list.insertAtPosition(100,3);
       list.traverseBackward();
       System.out.println("\ndelete position of the 2");
      list.delete(2);
       list.traverseBackward();
    }
}
