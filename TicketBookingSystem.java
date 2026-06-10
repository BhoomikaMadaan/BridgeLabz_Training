import java.util.*;

class TicketBookingSystemIMple {
    Queue<String> queue;

    public TicketBookingSystemIMple() {
        queue = new LinkedList<>();
    }

    public void addCustomer(String name) {
        queue.offer(name);
        System.out.println(name + " joined the queue");
    }

    public void serveCustomer() {
        if (queue.isEmpty()) {
            System.out.println("No customers in queue");
            return;
        }
        String customer = queue.poll();
        System.out.println("Serving: " + customer);
    }

    public void currentCustomer() {
        if (queue.isEmpty()) {
            System.out.println("Queue Empty");
            return;
        }

        System.out.println("Current Customer: " + queue.peek());
    }

    public void displayQueue() {
        System.out.println("Queue: " + queue);
    }
}

public class TicketBookingSystem {
    public static void main(String[] args) {

        TicketBookingSystemIMple system = new TicketBookingSystemIMple();

        system.addCustomer("Anshu");

        system.addCustomer("Bhoomika");
        system.addCustomer("Palak");
        system.displayQueue();
        system.currentCustomer();
        system.serveCustomer();
        system.currentCustomer();
        system.displayQueue();
    }
}
