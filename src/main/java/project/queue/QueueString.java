package project.queue;

import java.util.Arrays;

public class QueueString {
    private String [] strings;
    private int head;
    private int tail;
    private int size;


    public QueueString(int size) {
        this.head = 0;
        this.tail = 0;
        this.strings = new String[size];
        this.size =size;

    }
    @Override
    public String toString() {
        return Arrays.toString(strings);
//                + " Index head: " + head +" Index tail: " + tail;
    }
    public void enqueue(String element){
        if(tail == (head-1)){
            System.out.println("Error");
            return;
        }
        strings[tail] = element;
        tail++;
        tail %= size;

    }
    public String dequeue(){
        if(head == tail){
            System.out.println("Queue is empty ");
        }
        String replacement = strings[head];
        strings[head] = "Empty";
        head++;
        head%=size;
        return replacement;
    }
    public String getFront(){
        String getFront= strings[head];
        return getFront;
    }
}
