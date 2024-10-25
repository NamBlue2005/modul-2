package Stack_Queue;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class CircularQueue {
    private Node front, rear;
    public CircularQueue() {
        front = null;
        rear = null;
    }
    public boolean isEmpty() {
        return front == null;
    }
    public void enQueue(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        rear.next = front;

        System.out.println("Đã chèn " + value + " vào hàng đợi.");
    }
    public void deQueue() {
        if (isEmpty()) {
            System.out.println("Hàng đợi trống!");
            return;
        }
        int value;
        if (front == rear) {
            value = front.data;
            front = rear = null;
        } else {
            value = front.data;
            front = front.next;
            rear.next = front;
        }

        System.out.println("Đã lấy " + value + " ra khỏi hàng đợi.");
    }
    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Hàng đợi trống!");
            return;
        }

        Node temp = front;
        System.out.print("Các phần tử trong hàng đợi: ");
        while (temp.next != front) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
}
class CircularQueueDemo {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.displayQueue();
        queue.deQueue();
        queue.deQueue();
        queue.displayQueue();
        queue.enQueue(50);
        queue.displayQueue();
    }
}