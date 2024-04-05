public class DDyanmicusRound extends DynamoBase {
    void Listy () {
        head = null;
    }
    void fill (Object item){
        newNode = new Node();
        newNode.element = item;
        if (head == null) {
            newNode.setPrev(newNode);
            newNode.setNext(newNode);
        } else {
            aux = head.getPrev();
            newNode.setPrev(aux);
            newNode.setNext(head);
            aux.setNext(newNode);
            aux.setPrev(newNode);
        }

        void press () {
            aux = this.head;
            for (aux = aux.next; aux != head; aux = aux.next) {
                System.out.print(aux.getElement().toString());
            }
        }
    }
}
