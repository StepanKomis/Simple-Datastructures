package lib.datastructures.src.stack;

import java.util.ArrayList;

/**
 * A generic stack data structure that supports operations such as push, pop, and peek.
 * @param <T> the type of elements stored in the stack
 */
public class Stack<T> {
    private ArrayList<T> content;
    private int count;

    /**
     * Creates a new empty stack.
     */
    public Stack() {
        content = new ArrayList<>();
        count = 0;
    }

    /**
     * Returns a list containing the elements in the stack.
     * @return a list containing the elements in the stack
     */
    public ArrayList<T> getData() {
        return this.content;
    }

    /**
     * Increases the size of the stack by 1.
     */
    private void increaseCount() {
        this.count++;
    }

    /**
     * Decreases the size of the stack by 1.
     */
    private void decreaseCount() {
        this.count--;
    }

    /**
     * Returns true if the stack is empty, false otherwise.
     * @return true if the stack is empty, false otherwise
     */
    public boolean isEmpty() {
        return this.count == 0;
    }

    /**
     * Returns the size of the stack.
     * @return the size of the stack
     */
    public int size() {
        return this.count;
    }

    /**
     * Adds an element to the top of the stack.
     * @param value the element to be added
     */
    public void push(T value) {
        this.content.add(value);
        this.increaseCount();
    }

    /**
     * Removes and returns the element at the top of the stack.
     * @return the element at the top of the stack
     */
    public T pop() {
        this.decreaseCount();
        return this.content.remove(this.count);
    }

    /**
     * A main method for testing the stack.
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Before pop:\n" + stack.getData());
        stack.pop();
        System.out.println("After pop:\n" + stack.getData());
    }
}