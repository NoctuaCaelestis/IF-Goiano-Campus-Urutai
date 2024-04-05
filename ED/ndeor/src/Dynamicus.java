class Dynamicus extends DynamoBase {
    void listy () {
        first = new Node();
        last = first;
        first.next = null;
    }

    void listy2 () {
        ffirst = new Node();
        llast = ffirst;
        ffirst.next = null;
    }
    void listy3 () {
        fffirst = new Node();
        lllast = fffirst;
        fffirst.next = null;
    }
    void fillHalf (Object key) {
        newNode = new Node();
        while (aux.next != null && aux.next.element < (int) key){
            aux = aux.next;
        }
        q = aux.next;
        aux.next = newNode;
        newNode.element = (int) key;
        newNode.next = q;
        if (last == aux) {
            last = newNode;
        }
    }
    void fillBeg (int item) {
        newNode = new Node();
        aux = first.next;
        first.next = newNode;
        newNode.element = item;
        newNode.next = aux;
        if (last == first)
            last = newNode;
    }
    void fillBeg2 (int item) {
        neww = new Node ();
        aux = fffirst.next;
        first = neww;
        neww.element = item;
        neww.next = aux;
        if (lllast == fffirst)
            lllast = neww;
    }
    void fillEnd(int item) {
        last.next = new Node();
        last = last.next;
        last.element = item;
        last.next = null;
    }
    void fillEnd2 (int item) {
        llast.next = new Node();
        llast = llast.next;
        llast.element = item;
        llast.next = null;
    }
    boolean compare () {
        boolean checkers = true;
        int x = 0, y = 0;
        aux = first;
        auxx = ffirst;
        while (aux.next != null){aux = aux.next ; x++;};
        while (auxx.next != null){auxx = auxx.next; y++;};
        if (x == y) {
            for (aux = first; aux.next != null; aux = aux.next) {
                if (checkers) {
                    checkers = false;
                    for (auxx = ffirst; auxx.next != null; auxx = auxx.next) {
                        if (aux.next.element == auxx.next.element) {
                            checkers = true;
                            break;
                        }
                    }
                }
            }
            return checkers;
        } else {
            return false;
        }
    }
    void printer() {
        for (aux = first; aux.next != null; aux = aux.next) {
            System.out.println(aux.next.element);
        }
    }
    void printerr() {
        for (auxx = ffirst; auxx.next != null; auxx = auxx.next) {
            System.out.println(auxx.next.element);
        }
    }
    void printerrr() {
        for (auxxx = fffirst; auxxx.next != null; auxxx = auxx.next) {
            System.out.println(auxxx.next.element);
        }
    }

    void order () {
        int x = 0, w, y = 0;
        for (aux = first; aux.next != null; aux = aux.next) {
            w = aux.next.element;
            for (auxx = ffirst; auxx.next != null; auxx = auxx.next) {
                if ( auxx.next.element < aux.next.element){
                    x = (int) auxx.next.element;
                }
            }
            for (aux = first; aux.next != null; aux = aux.next) {
                if (aux.next.element < w){
                    w = aux.next.element;
                }
            }
            if (y % 2 == 0)
                fillBeg2(w);
            else
                fillBeg2(x);
            y++;
        }
    }
}