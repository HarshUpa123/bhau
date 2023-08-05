package august8;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Collections;

public class ArrayList6 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(12);
        a.add(8);
        a.add(15);
        a.add(19);
        a.add(6);
        System.out.println(a);
        Collections.sort(a);
        System.out.println(a);
        ListIterator <Integer> li = a.listIterator(a.size());
        while(li.hasPrevious()){
            System.out.print(li.previous()+" ");
        }
        System.out.println("");
        System.out.println("hello");
    }
    
}
