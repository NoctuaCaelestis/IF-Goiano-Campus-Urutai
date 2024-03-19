public class Node {
    Object element;
    Node next;
    Node prev;
    public Node () {}
    public Node (Object element){this.element = element;}

    public Object getElement() {return element;}

    public void setElement(Object element) {this.element = element;}

    public Node getNext() {return next;}

    public void setNext(Node next) {this.next = next;}

    public Node getPrev() {return prev;}

    public void setPrev(Node prev) {this.prev = prev;}
}
