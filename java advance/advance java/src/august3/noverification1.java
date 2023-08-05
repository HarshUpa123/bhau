package august3;

import java.util.Scanner;

public class noverification1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any mobile number");
        String n = sc.next();
        if (n.length()==10) {
            try {
                Long.parseLong(n);
                System.out.println("it is a valid mobilenumber ");
            } catch (Exception e) {
                System.out.println("only digits are allowed ");
            }
        }
        else{
            System.out.println("please enter the valid mobile number");
        }
    }
}
