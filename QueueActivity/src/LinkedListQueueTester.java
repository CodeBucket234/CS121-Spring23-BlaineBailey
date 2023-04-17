//**********************************************************************************************************************
// Activity 33: Queues
// Names: Blaine Bailey
// Date of Submission: 4/14/2023
//**********************************************************************************************************************
// This is the LinkedListQueueTester class. This program uses all the methods within the LinkedListQueue class to add
// and remove items from the queue, check to see if the queue is empty, display the queue, and peek at the head of the
// queue. This program starts off by adding names to the queue and displaying the queue. Then it starts checking if the
// queue is empty, displaying the number of elements in the queue, and removing names from the queue. Eventually, the
// queue is emptied, and the program displays the queue being empty.
//**********************************************************************************************************************
public class LinkedListQueueTester {
    public static void main(String[] args) {
        LinkedListQueue names = new LinkedListQueue();

        // #1
        System.out.println("#1 on Activity");
        names.enqueue("Tom");
        names.enqueue("Jane");
        names.enqueue("Beth");
        System.out.println(names.displayQueue());

        System.out.println();

        // #2
        System.out.println("#2 on Activity");
        names.enqueue("John");
        names.enqueue("Mary");
        System.out.println(names.displayQueue());

        System.out.println();

        // #3
        System.out.println("#3 on Activity");
        System.out.printf("Queue is empty: %b\n", names.isEmpty());
        System.out.printf("Number of items in queue is %d\n", names.size());
        System.out.printf("The head of the queue is: %s\n", names.peek());
        System.out.printf("Remove %s\n", names.dequeue());

        System.out.println();
        System.out.println();

        // #4
        System.out.println("#4 on Activity");
        System.out.println(names.displayQueue());

        System.out.println();

        // #5
        System.out.println("#5 on Activity");
        System.out.printf("Queue is empty: %b\n", names.isEmpty());
        System.out.printf("Number of items in queue is %d\n", names.size());
        System.out.printf("The head of the queue is: %s\n", names.peek());

        System.out.println();
        System.out.println();

        // #6
        System.out.println("#6 on Activity");
        System.out.printf("Remove %s\n", names.dequeue());
        System.out.printf("The head of the queue is: %s\n", names.peek());

        System.out.println();
        System.out.println();

        // #7
        System.out.println("#7 on Activity");
        System.out.printf("Remove %s\n", names.dequeue());
        System.out.printf("The head of the queue is: %s\n", names.peek());

        System.out.println();
        System.out.println();

        // #8
        System.out.println("#8 on Activity");
        System.out.printf("Remove %s\n", names.dequeue());
        System.out.printf("The head of the queue is: %s\n", names.peek());

        System.out.println();
        System.out.println();

        // #9
        System.out.println("#9 on Activity");
        System.out.printf("Remove %s\n", names.dequeue());
        System.out.printf("The head of the queue is: %s\n", names.peek());

        System.out.println();
        System.out.println();

        // #10
        System.out.println("#10 on Activity");
        System.out.printf("Queue is empty: %b\n", names.isEmpty());
    }
}