


//S/20/426
public class Driver {
    public static void main(String[] args) {
        LinkedList2 list=new LinkedList2();
        System.out.println("a)");
        list.insertNodeFront(20);
        list.insertNodeFront(30);
        list.insertNodeFront(40);
        list.insertNodeFront(50);
        list.displayNodes();

        System.out.println("b)");
        list.insertNodeFront(10);
        list.displayNodes();

        System.out.println("c)");
        list.insertNodeFront(60);
        list.displayNodes();

        System.out.println("d)");
        list.insertNext(30,70);
        list.displayNodes();

        System.out.println("e)");
        list.displayNodes();

        System.out.println("f)");
        list.deleteNode(70);
        list.displayNodes();



        System.out.println("g)");
        if(list.search(30)==null){
            System.out.println("value not found");
        }else{
            System.out.println("value found");
        }

    }
}
