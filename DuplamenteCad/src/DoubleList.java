public class DoubleList {
    private Node head;
    public DoubleList () {
        head = null;
    }

    public Object Insert (Object element) {
        Node newNode = new Node(element);

        if (!empty()){
            newNode.setPrev(newNode);
            newNode.setNext(newNode);
            this.head = newNode;
        } else {
            Node aux = head.getPrev();
            newNode.setPrev(aux);
            newNode.setNext(head);
            aux.setPrev(newNode);
            head.setPrev(newNode);
        }


        return null;
    }

    public boolean empty () {return head == null;}
}
