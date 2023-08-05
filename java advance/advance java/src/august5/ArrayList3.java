package august5;

import java.util.ArrayList;

public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList <Integer> al3=new ArrayList <>();
          al3.add(44);
          al3.add(77);
          al3.add(99);
//          al3.add("hii");
          System.out.println(al3);
//          al3.remove("hii");
          al3.remove(new Integer(44));
           System.out.println(al3);
    }
   
}
