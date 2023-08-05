/*
 * what = classes which are derived from premitive datatypes.
 * why = to convert prmitive into the objects.
 * in java we can get the data in three types one string two premitive three object
 */
package august2;
public class Wrapperclass {
    public static void main(String[] args) {
/*           int x =19;
           System.out.println(""+x);
           Integer y = x;//auto-bixing in this compiler will write integer.valueof automatically
           System.out.println(""+y);
           Integer z = new Integer(x);//boxing
           System.out.println(""+z);*/
             /* Integer a = new Integer(3);
              int j = a.intValue();//converting integer object to int known as unboxing
              System.out.println(" "+j);
              int k = a;//auto unboxing
              System.out.println(" "+k);*/
               String a = "4";
               System.out.println("before conversion "+a);
               float b =  Float.parseFloat(a) ;
               System.out.println("after conversion "+b);
               int c = Integer.valueOf(a);
               System.out.println("converting using value of "+c);
               
    }
    
}
