// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
         LinkedList list=new LinkedList();


         list.addFront(1);
        list.addFront(2);
        list.addFront(3);
        list.addFront(4);
        list.addFront(5);
        list.displayAllElements();

        System.out.println("=====Add Element Front========");
        list.addEnd(10);
        list.addEnd(9);
        list.displayAllElements();


        System.out.println("=======Check Element========");
        System.out.println(list.nodeExist(4));
        //System.out.println(list.SearchNode(4));

        System.out.println("=======Element add to target value========");
        list.insertNextNode(5,100);
        list.displayAllElements();






    }
}