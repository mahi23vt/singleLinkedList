public class Main {
    public static void main(String[] args) {
        singleLinkedListClass list = new singleLinkedListClass();
        list.addToFront(new Number(1));
        list.addToFront(new Number(2));
        list.addToFront(new Number(3));
        list.addToFront(new Number(4));
        list.addToFront(new Number(5));
        list.addToFront(new Number(6));
        list.addToFront(new Number(7));
        list.addToFront(new Number(8));
        list.addToFront(new Number(9));
        list.addToFront(new Number(10));
        list.addToBack(new Number(11));
        list.addToIndex(new Number(100),3);
        list.display();
        list.deleteFromFront();
        list.deleteFromBack();
        list.deleteAtIndex(5);
        System.out.println(list.findNode(100).getNumber().getVal());
        list.display();
        System.out.println(list.getNode(4).getNumber().getVal());
    }
}