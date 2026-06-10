import java.util.*;

class CircularArrays {
    private ArrayDeque<Integer> queue;
    private int capacity;

    public CircularArrays(int capacity) {
        this.capacity = capacity;
        queue = new ArrayDeque<>();

    }

    public Boolean isEmpty() {
        return queue.isEmpty();
    }

    public Boolean isFull() {

        return queue.size() == capacity;
    }

    public void enqueue(int val) {
        if (isFull()) {
            System.out.println("queue full");
            return;
        }
        queue.offer(val);
        System.out.println(val + " inserted");
    }

    public void dequeue() {

        if (isEmpty()) {

            System.out.println("Queue Empty");

            return;
        }

        System.out.println("Removed : " + queue.poll());
    }

    public void display() {

        System.out.println(queue);
    }
}

public class CircularArray {
    public static void main(String[] args) {
        CircularArrays q = new CircularArrays(3);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.enqueue(40);
        q.display();
        q.dequeue();
        q.enqueue(40);

        q.display();
    }
}
