package project.testQueue;

import org.junit.Test;
import project.queue.QueueString;

public class TestQueueString {
    @Test
    public void testQueueString(){
        QueueString string = new QueueString(5);
        string.enqueue("Valeriu");
        string.enqueue("Anca");
        string.enqueue("Cornel");
        string.enqueue("Laura");
        string.enqueue("George");
        string.dequeue();
        string.dequeue();
        string.getFront();
        System.out.println(string.getFront());
        System.out.println(string);
    }



}
