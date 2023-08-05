package august4;

import java.util.Scanner;

public class passwordvalid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your password without space ");
        String pass = sc.next();
        pass.trim();
        boolean f = false,l=false,a=false,g=false;
        if (pass.length() > 6 && pass.length() < 10) {
            for (int i = 0; i < pass.length(); i++) {
                Character ch = pass.charAt(i);
                 //System.out.println(ch);
                 if (Character.isUpperCase(ch)) {
                      //System.out.println("character is upper case");
                        f = true;
                        
                    }
                     
                     if (Character.isLowerCase(ch)) {
                        //System.out.println("character is lower case");
                    l = true;
                    
                }
               
            
               if (Character.isDigit(ch)) {
                    //System.out.println("character is digit");
                    a=true;
                    
                }
                 if (!Character.isDigit(ch)&&!Character.isAlphabetic(ch)) {
                    //System.out.println("character is not an alphabate nor a digit");
                    g=true;
                    
                }
       
            }

        } 
        else {
            System.out.println("size of password must be 6 to 10");
            
        }
        if (f&&l&&a&&g) {
            System.out.println("password is correct");
        }
        else{
            System.out.println("password is wrong");
        }
    }
}