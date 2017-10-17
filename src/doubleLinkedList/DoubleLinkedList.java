package doubleLinkedList;

public class DoubleLinkedList {
    private node<T> _start=null, _end=null;

    public DoubleLinkedList() {
        _start = new node<T>();
        _start.setIndex(-1);
        _end = new node<T>();
        _end.setIndex(-1);
    }

    public DoubleLinkedList(T value) {
        this();
        node<T> nuevo = new node<T>(value);
        _end.setBack(nuevo);
        //_end.getback().setIndex(0);
        _start.setNext(_end.getBack());
        _start.getNext().setIndex(0);
    }
}
