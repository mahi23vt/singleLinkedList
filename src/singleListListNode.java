public class singleListListNode {
    private Number number;
    singleListListNode next;

    public singleListListNode(Number number) {
        this.number = number;
    }

    public singleListListNode(Number number, singleListListNode next) {
        this.number = number;
        this.next = next;
    }

    public Number getNumber() {
        return number;
    }

    public void setNumber(Number number) {
        this.number = number;
    }

    public singleListListNode getNext() {
        return next;
    }

    public void setNext(singleListListNode next) {
        this.next = next;
    }
}
