public class QueueB{
    static class Queue {
        static int arr[];
        static int size;
        static int rear;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;

        }

        public static boolean isEmplty(){
            return rear == -1;
        }

        // add
        public static void add(int data){
            if(rear == size-1){
                System.out.println("Queue is full: ");
            }
        }
    }
}
