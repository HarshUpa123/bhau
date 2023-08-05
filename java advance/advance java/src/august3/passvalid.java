
package august3;

import java.util.Scanner;

public class passvalid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your password");
        String s = sc.next();
        char ch;
        boolean f=false,l=false,a=false,g=false;
        if (s.length()>=6&&s.length()<=10) {
            
        
        for (int i = 0; i < s.length(); i++) {
         ch = s.charAt(i);
         
            if ((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')||(ch>='0'&&ch<='9')) {
                
                if (ch>='A'&&ch<='Z') {  
                f=true;
                 }
            if (ch>='a'&&ch<='z') {
                l=true;
                 }
            if (ch>='0'&&ch<='9') {
                a=true;
                
            }
      
            
        }
            else{
                g=true;
                }
    }
        if (f&&l&&a&&g) {
            System.out.println("password is correct");
        }
        else{
            System.out.println("password is not correct");
        }
    
}
        else{
            System.out.println("password length must be 6 to 10");
        }
  }
}