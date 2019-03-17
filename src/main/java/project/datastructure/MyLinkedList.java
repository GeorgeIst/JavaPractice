package project.datastructure;

public class MyLinkedList {
    Node head;
    Node tail;

    public MyLinkedList(Node head) {
        this.head = head;
    }

    public void prinList() {
        Node curentNode = head;
        while (curentNode != null) {
            System.out.print(curentNode.data + " ");
            curentNode = curentNode.next;
        }
    }

    public void insertHeadLeft(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        this.head = newNode;
    }

    public void insertHeadRight(int data) {
        Node nodeToAdd = new Node(data);

        if(head == null){
             head = new Node(data);
             return;
        }
        else {
            Node lastNode = head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;

            }
            lastNode.next = nodeToAdd;
        }

    }
    public void insertAfter(Node b, int data){
        if(listContains(b)){
            Node newNode = new Node(data);
            newNode.next = b.next;
            b.next = newNode;
        }else {
            System.out.println("Node " + b.data + " does not exist");
        }

    }
    boolean listContains(Node n){
        boolean contains = false;
        Node node = head;
        while(node != null && node.data != n.data){
            node = node.next;
        }
        if(node != null){
            contains = true;
        }

        return contains;
    }
}
