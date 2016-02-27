/**
 * Student Name: Marcelo Gheiler
 * Filename: Stack
 * Date: 2/8/16
 * TA Name: Shengbo Ge
 * Assignment:
 * Lab: MW 2-3:15pm
 * Lab Location: Gavett 244
 * I affirm that I have not given or received any unauthorized help on this assignment, and that this work is my own
 */
public class Stack<T> implements StackInterface<T> {

	SingleLinkedList<T> list;


	public Stack() {
		list = new SingleLinkedList<>();
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public void push(T x) {
		//SingleLinkedListNode newNode = new SingleLinkedListNode();
		//newNode.data = x;

		list.insert(x);

	}

	@Override
	public T pop() {
		if (isEmpty()) {
			return null;
		}

		list.delete(list.first.data);
		return list.first.data;
	}

	@Override
	public T peek() {
		return list.first.data;
	}
}
