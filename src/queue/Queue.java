package lib.datastructures.src.queue;

import java.util.ArrayList;

/**
 * A generic queue data structure that uses an ArrayList to store the elements.
 * @param <T> the type of elements in the queue
 */
public class Queue<T> {

    private ArrayList<T> content;
    private int count;

    /**
     * Creates a new empty queue.
     */
    public Queue() {
        content = new ArrayList<>();
        count = 0;
    }

    /**
     * Returns a reference to the internal ArrayList that stores the elements.
     * @return the internal ArrayList
     */
    public ArrayList<T> getData() {
        return content;
    }

    /**
     * Returns the number of elements in the queue.
     * @return the number of elements
     */
    public int size() {
        return count;
    }

    /**
     * Returns true if the queue is empty, false otherwise.
     * @return true if the queue is empty, false otherwise
     */
    public boolean isEmpty() {
        return count == 0;
    }

    /**
     * Adds an element to the back of the queue.
     * @param value the element to add
     */
    public void enqueue(T value) {
        content.add(value);
        count++;
    }

    /**
     * Increases the size of the count variable.
     */
    public void increaseCount() {
        count++;
    }

    /**
     * Decreases the size of the count variable.
     */
    public void decreaseCount() {
        count--;
    }

    /**
     * Removes and returns the element at the front of the queue.
     * @return the element at the front of the queue
     */
    public T dequeue() {
        T element = content.get(0);
        content.remove(0);
        count--;
        return element;
    }

    /**
     * A main method for testing the queue.
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println("Size: " + queue.size());
        System.out.println("Is empty: " + queue.isEmpty());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Size: " + queue.size());
        System.out.println("Is empty: " + queue.isEmpty());
    }
}