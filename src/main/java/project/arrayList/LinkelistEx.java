package project.arrayList;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkelistEx {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Luni");
        linkedList.add("Marti");
        linkedList.add("Miercuri");
        linkedList.add("Joi");
        linkedList.add("Vineri");
        linkedList.add("Sambata");
        linkedList.add("Duminica");
//        System.out.println(linkedList.getLast());
//        System.out.println(linkedList.getFirst());
        Iterator<String> iterator = linkedList.descendingIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }



}
