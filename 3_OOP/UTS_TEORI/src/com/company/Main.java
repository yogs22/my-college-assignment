package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(3);
        list.add(5);
        Iterator<Integer> i = list.iterator();
        Collections.reverse(list);
        Collections.shuffle(list);
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
    }
}
