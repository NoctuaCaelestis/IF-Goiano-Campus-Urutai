public class DynamoBase {
    public static class Node {
        public Object getElement() {
            return element;
        }

        Object element;
        Node next;
        Node prev;

        public Node getPrev() {
            return prev;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }
    }

    protected static Node list;
    protected static Node first;
    protected static Node last;
    protected static Node aux;
    protected static Node newNode;
    protected static Node q;
    //
    protected static Node ffirst;
    protected static Node llast;
    protected static Node auxx;
    protected static Node fffirst;
    protected static Node lllast;
    protected static Node auxxx;
    protected static Node neww;
    //
    protected static Node head;
}
