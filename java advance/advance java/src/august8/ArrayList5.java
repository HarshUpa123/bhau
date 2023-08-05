package august8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import javax.swing.JSpinner;

public class ArrayList5 {
    public static void main(String[] args) {
        ArrayList <Integer> al = new ArrayList <Integer> ();
        al.add(10);
        al.add(15);
        al.add(9);
        al.add(18);
        al.add(20);
        al.add(13);
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
/*       ListIterator <Integer> itr =  al.listIterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
      System.out.println("");
   }*/
  /*  ListIterator <Integer> itr =  al.listIterator(2);
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println("");
    }*/
  ListIterator <Integer> itr =  al.listIterator();
        while(itr.hasNext()){
            int el = itr.next();
            if(el==18){
                itr.remove();
        }
            System.out.print(al+" ");
 
    }
        System.out.println("");   
}
}