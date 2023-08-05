
package august5;

/**
 *
 * @author admin
 */
import java.util.ArrayList;
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList <String> al = new ArrayList<String>(); 
        al.add("chheku");
        al.add("a");
        al.add("b");
        ArrayList<String> al1= new ArrayList<>();
        al1.add("hello");
        al1.add("c");
        al1.add("d");
        al.addAll(al1);
        al1.addAll(al);
        System.out.println(al);
        System.out.println(al1);
        al.retainAll(al1);
        al1.retainAll(al);
        System.out.println(al);
        System.out.println(al1);
    }
}
