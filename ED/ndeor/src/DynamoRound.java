public class DynamoRound extends DynamoBase{
    void Listy () {
        list = new Node();
        list.next = null;
    }
    void fillEnd(Object item) {
        newNode = new Node();
        newNode.element = item;
        if (list.next == null) {
            list = newNode;
            newNode.next = list;
        } else {
            newNode.next = list.next;
            list.next = newNode;
            list = newNode;
        }
    }
}
