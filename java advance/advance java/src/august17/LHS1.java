package august17;

import java.util.LinkedHashSet;

public class LHS1 {
    public static void main(String[] args) {
        LinkedHashSet<car> lh =new LinkedHashSet<>();
        lh.add(new car(1, "indigo", 3));
        lh.add(new car(3, "scarpio", 1));
        lh.add(new car(4, "duster", 3.1));
        lh.add(new car(6, "breza", 1.4));
        lh.add(new car(7, "bulleno", 3.3));
        lh.add(new car(1, "indiga", 3.3));
        for (car object : lh) {
            System.out.println(object.getCarno()+" "+object.getName()+" "+object.getModel());
        }
    }
    
}
