public class MyCircularQueue {

    int[] arr;
    int front;
    int rear;
    int size;
    int capacity;

    public MyCircularQueue(int k) {
        arr = new int[k];
        capacity = k;
        front = 0;
        rear = -1;
        size = 0;
    }

    public Boolean enQueue(int val) {
        if (isFull())
            return false;

        rear = (rear + 1) % capacity;
        arr[rear] = val;
        size++;
        return true;
    }

    public Boolean deQueue() {

        if (isEmpty()) {
            return false;
        }

        front = (front + 1) % capacity;
        size--;
        return true;
    }

    public int front() {
        if (isEmpty())
            return -1;

        return arr[rear];
    }

    public Boolean isEmpty() {
        return size == 0;
    }

    public Boolean isFull() {

        return size == capacity;
    }
}