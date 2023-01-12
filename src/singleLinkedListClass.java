public class singleLinkedListClass {
    private singleListListNode head,tail;
    private int size;

    public void addToFront(Number number) {
        singleListListNode node = new singleListListNode(number);
        node.next = head;
        if(tail==null)
            tail=head;
        head = node;
        size++;
    }
    public void deleteFromFront()
    {
        singleListListNode toDelete = head;
        head= head.next;
        toDelete.next=null;
        size--;
        System.out.println(toDelete.getNumber().getVal()+" Deleted Successfully");
        System.out.println("Updated List is:");
        display();
    }

    public void addToBack(Number number)
    {
        singleListListNode node = new singleListListNode(number);
        if(tail == null)
        {
            addToFront(number);
            return;
        }
        tail.next=node;
        node.next=null;
        tail=node;
        size++;
    }
    public void deleteFromBack()
    {
        if(size<=1) {
            deleteFromFront();
            size--;
            return;
        }
        singleListListNode deletedNode = tail;
        singleListListNode secondLastNode = getNode(size-2);
        secondLastNode.next=null;
        tail=secondLastNode;
        size--;
        System.out.println(deletedNode.getNumber().getVal()+" deleted successfully");
        display();
    }
    public void deleteAtIndex(int index)
    {
        singleListListNode node= getNode(index-1);//This will take the console to the index just before the one to be deleted
        singleListListNode toDeleteNode = node.next;
        node.next=toDeleteNode.next;
        toDeleteNode.next=null;
        size--;
        System.out.println(toDeleteNode.getNumber().getVal()+" deleted Successfully");
        display();
    }
    public singleListListNode getNode(int index)
    {
//        This gives the node of the index we are referring
//        suppose index = 5, then it will give the node which is present at the index 5
        singleListListNode node = head;
        for(int i=0;i<index;i++)
        {
            node=node.next;
        }
        return node;
    }
    public singleListListNode findNode(int val)
    {
        singleListListNode temp = head;
        while(temp !=null)
        {
            if(temp.getNumber().getVal()==val)
                return temp;
            temp=temp.next;
        }
        return null;
    }
    public void addToIndex(Number number, int index)
    {
        singleListListNode temp = head;
        for(int i =1;i<index;i++)
        {
            temp=temp.next;
        }
        singleListListNode node = new singleListListNode(number,temp.next);
        temp.next = node;
        size++;
    }

    public void display()
    {
        singleListListNode tempNode=head;
        while(tempNode!=null)
        {
            System.out.print(tempNode.getNumber().getVal()+"-->>");
            tempNode=tempNode.next;
        }
        System.out.println("END");
    }
}
