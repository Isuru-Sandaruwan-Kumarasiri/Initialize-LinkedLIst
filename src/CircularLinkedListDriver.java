public class CircularLinkedListDriver {
    public static void main(String[] args) {
        CircularLinkedList cll=new CircularLinkedList();
        cll.addNode(1);
        cll.addNode(2);
        cll.addNode(3);
        cll.addNode(4);
        cll.addNode(5);
        cll.addNode(6);
        cll.addNode(7);

        cll.traverseList();

        System.out.println(cll.search(4));

        cll.delete(6);
        cll.traverseList();
    }
}
