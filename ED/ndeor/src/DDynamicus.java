public class DDynamicus extends DynamoBase{
    void Listy () {
        head = null;
        last = head;
    }

    void fillMiddle (Object item) {
        newNode = new Node();
        newNode.element = item;
        aux = head;
        Node prev = aux.getPrev();
        for (; aux.next != null && (Integer) aux.next.element < (int) item; aux = aux.next) {}
        newNode.setPrev(prev);
        newNode.setNext(aux);
        prev.setNext(newNode);
        aux.setNext(newNode);
    }
}
