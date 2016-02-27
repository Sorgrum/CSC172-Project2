/**
 * Student Name: Marcelo Gheiler
 * Filename: SimpleLinkedList
 * Date: 2/1/16
 * TA Name: Shengbo Ge
 * Assignment:
 * Lab: MW 2-3:15pm
 * Lab Location: Gavett 244
 * I affirm that I have not given or received any unauthorized help on this assignment, and that this work is my own
 */
public interface SingleLinkedListInterface<T> {

	public void insert(T x);

	public void delete(T x);

	public boolean contains(T x);

	public T lookup(T x);

	public boolean isEmpty();

	public void printList();

}

