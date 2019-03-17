package project.testQueue;

import org.junit.Test;
import project.queue.Queue;

public class TestQueue {
    @Test
    public void testQueue() throws Exception {
        Queue myQueue = new Queue(4);

        myQueue.enqueue(7);
        myQueue.enqueue(4);
        myQueue.enqueue(9);
        myQueue.enqueue(7);
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.getFront();
        System.out.println(myQueue.getFront());
        System.out.println(myQueue);








    }

}
