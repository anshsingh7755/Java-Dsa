// Queue used for storing and managing data in a specific order
// principle of FIFO
// {1,2,4,56,7,8} =>> {2,4,56,7,8,9}
// 1 gets dequeue and 9 gets enqueued

// Applications of Queue
// Task scheduling in operating systems
// Data transfer in network communication
// Simulation of real-world systems (e.g., waiting lines)
// Priority queues for event processing queues for event processing

// implementation
//  =>> by using ARRAYS
//  =>> by using Linked List

// types
// =>> simple {FIFO}
// =>> double ended  {nsertion and deletion operations, both can be performed from both ends}
// =>> circular {last position is connected back to the first position.}
// =>> priority  { special queue where the elements are accessed based on the priority assigned to them}

import java.util.LinkedList;
import java.util.Queue;

public class Basics{
    // method to enqueue
    public static void enqueue(Queue<Integer> queue, int element){
        queue.add(element);
    }
    // method to dequeue
    public static  int dequeue(Queue<Integer> queue){
        return queue.poll();
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        // create a queue usin LL
        Queue<Integer> queue = new LinkedList<>();

        // enqueue
        enqueue(queue, 10);
        enqueue(queue, 20);
        enqueue(queue, 30);

        // print
        System.out.println("Queue elem after enqueue: ");
        System.out.println(queue);

        // dequeue
        System.out.println("dequeuing element: " + dequeue(queue));
        System.out.println("dequeuing element: " + dequeue(queue));

        // print after deque
        System.out.println("Queue elem after dequeue: ");
        System.out.println(queue);
    }
}