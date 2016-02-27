/**
 * Student Name: Marcelo Gheiler
 * Filename: StackInterface
 * Date: 2/8/16
 * TA Name: Shengbo Ge
 * Assignment:
 * Lab: MW 2-3:15pm
 * Lab Location: Gavett 244
 * I affirm that I have not given or received any unauthorized help on this assignment, and that this work is my own
 */
public interface StackInterface<T> {

	public boolean isEmpty();

	public void push(T x);

	public T pop();

	public T peek();

}
