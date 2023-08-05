/*
1 we used stringbuffer to use the reverse function because we do not have reverse in string
  we used concatination in string buffer to convert primitive to string.
  then again we convert it into the string using tostring function.

*/
package august3;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number ");
        int n =  sc.nextInt();
        String s = new StringBuffer("" +n).reverse().toString();
        System.out.println("number after reverse is "+ s);
        System.out.println("end of the programm");
        
    }
    
}
