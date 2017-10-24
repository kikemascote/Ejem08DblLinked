package doubleLinkedList;

import node.node;

public class DoubleLinkedList<T> {

	public node<T> start = null, end = null;

	public DoubleLinkedList() {
		start = new node<T>();
		start.setIndex(-1);
		end = new node<T>();
		end.setIndex(-1);
	}

	public DoubleLinkedList(T value) {
		this();
		node<T> nuevo = new node<T>(value);
		end.setBack(nuevo);
		// end.getback().setIndex(0);
		start.setNext(end.getBack());
		start.getNext().setIndex(0);
	}

	public void addEnd(T value) {

	}

	public void addStart(T value) {
		node<T> tmp = start.getNext();
		start.setNext(new node<T>(value));
	}

	public node<T> Search(T value) {
		return Search(value, start, end);

	}

	private node<T> Search(T value, node<T> start, node<T> end) {
		if (start.getNext() == null) {
			return null;
		} else if (start.getNext().getValue().equals(value)) {
			return start.getNext();
		} else if (end.getBack().getValue().equals(value)) {
			return end.getBack();
		}
		return Search(value, start.getNext(), end.getBack());
	}
}
