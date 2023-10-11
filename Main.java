public class Main {



    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Peek: " + queue.peek()); // Output: Peek: 10

        System.out.println("Dequeue: " + queue.dequeue()); // Output: Dequeue: 10
        System.out.println("Dequeue: " + queue.dequeue()); // Output: Dequeue: 20

        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60); // Output: Queue is full. Cannot enqueue.

        System.out.println("Peek: " + queue.peek()); // Output: Peek: 30


        System.out.println("Time for a LL Queue");
        //Linked List main meth
        LinkedLQueue LLqueue = new LinkedLQueue();

        LLqueue.enqueue(10);
        LLqueue.enqueue(20);
        LLqueue.enqueue(30);

        System.out.println("Peek: " + LLqueue.peek()); // Output: Peek: 10

        System.out.println("Dequeue: " + LLqueue.dequeue()); // Output: Dequeue: 10
        System.out.println("Dequeue: " + LLqueue.dequeue()); // Output: Dequeue: 20

        LLqueue.enqueue(40);
        LLqueue.enqueue(50);

        System.out.println("Peek: " + LLqueue.peek()); // Output: Peek: 30
    }
}
/**
 * Differences between a Linked List Queue and an Array Queue:
 *
 * 1. Implementation:
 *    - Linked List Queue uses a linked list structure, where each node points to the next node.
 *    - Array Queue uses a fixed-size array to store elements.
 *
 * 2. Dynamic Size:
 *    - Linked List Queue can dynamically resize based on the number of elements added or removed.
 *    - Array Queue has a fixed size determined during initialization, and it cannot exceed that size.
 *
 * 3. Memory Allocation:
 *    - Linked List Queue dynamically allocates memory for each node as elements are added.
 *    - Array Queue pre-allocates memory for the entire array, even if not all slots are used.
 *
 * 4. Insertion and Deletion:
 *    - Linked List Queue has O(1) time complexity for both enqueue and dequeue operations.
 *    - Array Queue has O(1) time complexity for enqueue but O(n) time complexity for dequeue
 *      (due to the need to shift elements after dequeueing).
 *
 * 5. Random Access:
 *    - Linked List Queue does not support random access to elements.
 *    - Array Queue allows direct access to any element using an index.
 *
 * 6. Efficiency in Operations:
 *    - Linked List Queue is more efficient for frequent enqueue and dequeue operations.
 *    - Array Queue is more efficient for frequent access to elements by index.
 *
 * 7. Space Efficiency:
 *    - Linked List Queue may use more memory due to the overhead of storing pointers for each element.
 *    - Array Queue is space-efficient when the maximum size is known and doesn't change frequently.
 */
