/**
 * Student Name: Marcelo Gheiler
 * Filename: Part2
 * Date: 2/1/16
 * TA Name: Shengbo Ge
 * Assignment:
 * Lab: MW 2-3:15pm
 * Lab Location: Gavett 244
 * I affirm that I have not given or received any unauthorized help on this assignment, and that this work is my own
 */
public class SingleLinkedList<T> implements SingleLinkedListInterface<T> {

	SingleLinkedListNode<T> first = new SingleLinkedListNode<>();

	@Override
	// Constant run time because it's being added to the front
	public void insert(T x) {
		SingleLinkedListNode<T> newNode = new SingleLinkedListNode<T>();
		if (!this.contains(x)) {
			newNode.data = x;
			newNode.next = first;

			first = newNode;
		} else {
			System.out.println("Did not add duplicate element: " + x);
		}
	}


	@Override
	public void delete(T x) {
		SingleLinkedListNode<T> previous = first;
		SingleLinkedListNode<T> current = previous.next;
		Boolean looping = true;

		if (this.contains(x)) {
			while (looping) {

				// Either the element is in the first position
				if (previous.equals(first) && previous.data.equals(x)) {
					previous.data = null;
					first = current;
					looping = false;
				}
				// Or it isn't
				else {

					// If the element is in the middle of the list, the prevous node has to point to the node after the
					// one being removed
					if (current.next != null && current.data.equals(x)) {
						previous.next = current.next;
						current.data = null;
						looping = false;
						// If the element is the last in the list, it doesn't need to point anywhere
					} else if (current != null && current.data.equals(x)) {
						current.next = null;
						current.data = null;
						looping = false;
						// Otherwise, you haven't found the right node, keep looking
					} else {
						previous = previous.next;
						current = current.next;
					}
				}

			}
		}


	}


	@Override
	public boolean contains(T x) {
		SingleLinkedListNode<T> current = first;
		Boolean looping = true;

		while (current.next != null) {
			if (current.data.equals(x)) {
				return true;
			} else {
				current = current.next;
			}
		}

		return false;
	}

	@Override
	public T lookup(T x) {
		SingleLinkedListNode<T> current = first;

		while (current.next != null) {
			if (current.data.equals(x)) {
				return x;
			}
			current = current.next;
		}
		return null;
	}

	@Override
	public boolean isEmpty() {
		return first == null;
	}

	@Override
	// Runtime n because it has to traverse through each element in the list
	public void printList() {
		SingleLinkedListNode<T> current = first;
		String list = "";
		while (current.next != null) {

			list += current.data + " ";
			current = current.next;
		}
		System.out.println(list);
	}
}
