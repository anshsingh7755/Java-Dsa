import java.util.PriorityQueue;
import java.util.Queue;

public class removing {
    public static void main(String[] args) {
        Queue<String> pq = new PriorityQueue<>();

        pq.add("Geeks");
        pq.add("For");
        pq.add("Geeks");

        System.out.println(pq);

        pq.remove("Geeks");
        
        System.out.println("After Remove " + pq);

        System.out.println("Poll Method " + pq.poll());

        System.out.println("Final Queue " + pq);
    }
}
