package project.stack;

import java.util.Arrays;

public class MyStack {

    private int top;
    private int [] elements;
    private int size;

    public MyStack(int size) {
        this.elements = new int[size];
        this.size = size;
        this.top = -1;
    }

    public int[] getElements() {
        return elements;
    }

    public MyStack(MyStack oldStack){
        int oldSize= oldStack.size;
        this.size = oldStack.size + oldStack.size/2;
        this.top = oldSize-1;
        this.elements = new int[size];
        for(int i = 0; i < oldSize; i++){
            this.elements[i] = oldStack.elements[i];
        }

    }

    @Override
    public String toString() {
        return "MyStack{" +
                "elements=" + Arrays.toString(elements) +
                ", size=" + size +
                '}';
    }
    public void push(int add){
        elements[top+1] = add;
        top++;
    }
    public int pop(){
        if(top<0){
            System.out.println("stack is empty!");
            return -1;
        }
        int remove = elements[top];
        elements[top] = 0;
        top--;
        return remove;
    }
    public int peek(){
        return elements[top];

    }
}
