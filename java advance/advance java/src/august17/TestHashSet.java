package august17;

import java.util.HashSet;

public class TestHashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(14);
        hs.add(17);
        hs.add(16);
        hs.add(14);
       // hs.add(17);
       // hs.add(19);
      //  hs.add(14 );
        for (Integer h : hs) {
            System.out.println(h);
        }
    }
   
}
