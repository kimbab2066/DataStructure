package list;

public class SinglyLinkedList3<E> implements List<E> {

	private Node3<E> head;
	private Node3<E> tail;
	private int size;

	public SinglyLinkedList3() {
		this.head = null;
		this.tail = null;
		size = 0;
	}

	private Node3<E> Search(int idx) {
		if(idx>=size||idx<0) throw new IndexOutOfBoundsException();
		Node3<E> n = head;
		for (int i = 0; i < idx; i++) n = n.next;
		
		return n;
	}

	@Override
	public boolean add(E value) {
		return false;
	}

	@Override
	public void add(int index, E value) {

	}

	@Override
	public boolean remove(Object value) {
		return false;
	}

	@Override
	public E remove(int index) {
		return null;
	}

	@Override
	public E get(int index) {
		return null;
	}

	@Override
	public int indexOf(Object value) {
		return 0;
	}

	@Override
	public boolean contains(Object value) {
		return false;
	}

	@Override
	public void set(int index, E value) {

	}

	@Override
	public int size() {
		return 0;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public void clear() {

	}

}// end of class

class Node3<E> {
	E data;
	Node3<E> next;

	Node3(E data) {
		this.data = data;
		next = null;
	}
}
