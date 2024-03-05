# Stack Data Structure in Java

This document describes a generic stack implementation in Java using the `Stack` class.

**Class Definition:**

Java

```
package lib.datastructures.stack;

import java.util.ArrayList;

public class Stack<T> {
    // ...
}
```
**Description:**

The `Stack` class implements a Last-In-First-Out (LIFO) data structure, where elements are added and removed from the "top" of the stack. It provides functionalities for pushing, popping, and checking the size and emptiness of the stack.

**Properties:**

- **content:** An `ArrayList` that stores the elements of the stack.
- **count:** An integer variable that keeps track of the number of elements in the stack.

**Methods:**

- **Stack():** Constructor that initializes an empty stack.
- **getData():** Returns a copy of the internal `ArrayList` containing the elements.
- **increaseCount():** Private method that increments the `count` variable.
- **decreaseCount():** Private method that decrements the `count` variable.
- **isEmpty():** Checks if the stack is empty and returns `true` if it is, `false` otherwise.
- **size():** Returns the current size of the stack.
- **push(T value):** Adds an element (`value`) to the top of the stack.
- **pop():** Removes and returns the element at the top of the stack.
- **main(String[] args):** A sample main method that demonstrates the usage of the `Stack` class.

**Example Usage:**

Java

```
Stack<Integer> stack = new Stack<>();
stack.push(1);
stack.push(2);
stack.push(3);

System.out.println("Stack elements: " + stack.getData()); // Output: [1, 2, 3]

int popped = stack.pop();
System.out.println("Popped element: " + popped); // Output: 3
System.out.println("Stack elements after pop: " + stack.getData()); // Output: [1, 2]
```


This code creates a stack of integers, pushes three elements, prints the content, pops an element, and prints the remaining elements.

This is a basic markdown documentation of the `Stack` class. You can further enhance it by adding:

- More detailed descriptions of each method.
- Time and space complexity analysis of methods.
- Error handling information.