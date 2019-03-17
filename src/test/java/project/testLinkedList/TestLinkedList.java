package project.testLinkedList;

import org.junit.Test;
import project.datastructure.MyLinkedList;
import project.datastructure.Node;

public class TestLinkedList {

    @Test
    public void test(){
        Node n = new Node(5);

        MyLinkedList linkedlist = new MyLinkedList(n);
        linkedlist.insertHeadLeft(7);
        linkedlist.insertHeadRight(8);;
        Node positionToAddAfter = new Node(5);
        linkedlist.insertAfter(positionToAddAfter, 3);
        linkedlist.insertAfter(n, 4);
        linkedlist.prinList();
//        MyLinkedList list = new MyLinkedList(null);
//        list.insertHeadRight(3);
//        list.prinList();


    }
}
