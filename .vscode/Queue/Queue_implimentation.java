import java.util.LinkedList;
import java.util.Queue;

public class Queue_implimentation{
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // add elem
        queue.add("apple");
        queue.add("banana");
        queue.add("mango");

        // print
        System.out.println("Queue: "+ queue);

        // remove the front elem
        String front = queue.remove();
        System.out.println("Remove element: " + front);

        // print updadted queue
        System.out.println("Queue after removal : " + queue);

        // add another elem
        queue.add("date");

        // peek the elem
        String peeked = queue.peek();
        System.out.println("Peeked element: " + peeked);

        // updated queue
        System.out.println("Queue after peek : " + queue);
    }
}