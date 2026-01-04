public class Lista {
    
    Nodo root;
    Nodo tail;
    public Lista() {
        root = null;
        tail = null;
    }

    public boolean isEmpty() {
        return root==null;
    }

    public int getLength() {
        Nodo tmp = root;
        int l = 0;
        while (tmp!=null) {
            l++;
            tmp = tmp.getNext();
        }
        return l;
    }

    public void add( String s ) {
        Nodo n = new Nodo(s);
        addTail(n);
    }

    public void addHead( Nodo n ) {
        if (root == null) {
            root = tail = n;
        } else {
            n.setNext(root);
            root.setPrev(n);
            root = n;
        }
    }

    public void addTail( Nodo n ) {
        if (tail == null) {
            root = tail = n;
        } else {
            tail.setNext(n);
            n.setPrev(tail);
            tail = n;
        }
    }

    public boolean remove( String s ) {
        if (root==null) return false;
        if (root.getValue().equals(s)) {
            root = root.getNext();
            return true;
        }
        Nodo tmp=root, succ=root.getNext();
        while (succ!=null) {
            if (succ.getValue().equals(s)) {
                tmp.setNext(succ.getNext());
                return true;
            }
            tmp=succ;
            succ=succ.getNext();
        } 
        return false;
    }

    public boolean exists( String s ) {
        Nodo tmp = root;
        while (tmp!=null) {
            if (tmp.getValue().equals(s)) return true;
            tmp = tmp.getNext();
        }
        return false;
    }

    public Nodo find( String s ) {
        Nodo tmp = root;
        while (tmp!=null) {
            if (tmp.getValue().equals(s)) return tmp;
            tmp = tmp.getNext();
        }
        return null;
    }

    public String toString() {
        String s = "La lista contiene: ";
        Nodo temp = root;
        while (temp!=null) {
            s += temp.getValue() + " - ";
            temp = temp.getNext();
        }
        return s + "\n";
    }
    
    public String toReverseString() {
        String s = "Lista (indietro): ";
        Nodo temp = tail;
        while (temp != null) {
            s += temp.getValue() + " - ";
            temp = temp.getPrev();
        }
        return s;
    }
}
