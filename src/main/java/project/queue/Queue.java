package project.queue;

import java.util.Arrays;

public class Queue {
    private int[] elements;
    private int head;
    private int tail;
    private int size;


    public Queue(int size) {
        this.head = 0;
        this.tail = 0;
        this.elements = new int[size];
        this.size =size;

    }
    @Override
    public String toString() {
        return Arrays.toString(elements);
//                + " Index head: " + head +" Index tail: " + tail;
    }
    public void enqueue(int element){
        if(tail == (head-1)){
            System.out.println("Error");
            return;
        }
        elements[tail] = element;
        tail++;
        tail %= size;

    }
    public int dequeue(){
        if(head == tail){
                System.out.println("Queue is empty ");
        }
        int replacement = elements[head];
        elements[head] = 0;
        head++;
        head%=size;
        return replacement;
    }
    public int getFront(){
        int getFront= elements[head];
        return getFront;
    }


}
