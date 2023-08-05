package august3;

import java.util.Scanner;

public class noverification {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any mobile number");
        String n = sc.next();
        boolean flag = false;
        System.out.println(" " + n);
        if (n.length() == 10) {
            for (int i = 0; i < n.length(); i++) {
                char ch = n.charAt(i);
                if (!Character.isDigit(ch)) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("only digits are valid in mobile number ");
            } else {
                System.out.println("mobile number is valid");
            }

        } else {
            System.out.println("enter the valid mobile number ");
        }
    }
}
