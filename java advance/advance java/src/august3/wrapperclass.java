/*
there are three waysto convert primitive into string 
1 convert primitive into object then by using that object convert in string .
2 we can directly use to string function .
3 using concatination becaus we use "" which represrnt string then we use + concate which auto convert it into string. 
*/

package august3;
public class wrapperclass {
    public static void main(String[] args) {
        int x = 194;
        byte y=4,z=1;
        int a;
       /*String s = Integer.toString(x);
        System.out.println("after conversion : "+s);
     */
      /* Integer b = x;
       String s = b.toString();
        System.out.println("after conversion "+ s);
     */
      String s = " " +x;
        System.out.println("valur after conversion"+s);
        a=y+z;
        System.out.println("addition"+a);
}
}
