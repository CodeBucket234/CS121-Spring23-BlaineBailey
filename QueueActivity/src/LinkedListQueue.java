//**********************************************************************************************************************
// Activity 33: Queues
// Names: Blaine Bailey
// Date of Submission: 4/14/2023
//**********************************************************************************************************************
// This is the LinkedListQueue class. This class has a private inner class called Node. Node holds data and the next
// node. The node constructor creates a node with data and a next pointer. The LinkedListQueue class has two instance
// nodes: the head and tail, with default values of null. The method enqueue takes in an object as an argument, and
// adds it to the queue. The method dequeue removes the object that was first added to the queue and returns it if the
// queue has at least one item in it. Otherwise, dequeue prints out that the queue is empty, and returns null. The peek
// method returns the first item added to the queue if there is at least one item in the queue, or returns null if the
// queue is empty. The method isEmpty returns true if the queue is empty, or false if the queue is not empty. The method
// size returns an integer that represents the amount of data within the queue. The method displayQueue returns a string
// of all the data within the queue.
//**********************************************************************************************************************
public class LinkedListQueue {
    //Private inner class Node. This inner class stores all the data in the queue.
    private class Node {
        public Object data;
        public Node next;

        //Constructor creates data with next pointer
        public Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    //Instance nodes within queue.
    private Node head = null;
    private Node tail = null;

    //Adds an item to the queue.
    public void enqueue(Object item) {
        //Creates new data
        Node newNode = new Node(item, null);

        //Adds item either to head or tail depending on if the queue is empty
        if(isEmpty()) {
            head = newNode;
        }
        else {
            tail.next = newNode;
        }

        //Adds item to tail of the queue
        tail = newNode;
    }

    //Removes the first added element from the queue.
    public Object dequeue() {
        //Returns null if the queue is empty and prints out that the queue is empty
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        Object item = head.data;

        //If there is only one element in the queue
        if(tail == head) {
            tail = null;
        }

        //Shifts items in the queue so that the next item becomes the head
        head = head.next;
        return item;
    }

    //Returns the first added element of the queue.
    public Object peek() {
        //If the queue is empty, return null and print out that the queue is empty
        if(head == null) {
            System.out.println("Queue is empty");
            return null;
        }
        return head.data;
    }

    //Returns true if the queue is empty, and returns false otherwise
    public boolean isEmpty() {
        return head == null;
    }

    //Returns the size of the queue
    public int size() {
        //Initialize count as 0
        int count = 0;

        //Increase count for every data point in the queue
        for(Node node = head; node != null; node = node.next) {
            count++;
        }
        return count;
    }

    //Returns the queue as a string
    public String displayQueue() {
        //Initialize empty string
        String queueElements = "";

        //Add all data points to string
        for(Node node = head; node != null; node = node.next) {
            queueElements += String.format("%s%n", node.data);
        }
        return queueElements;
    }
}
